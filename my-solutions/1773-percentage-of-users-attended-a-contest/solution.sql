# Write your MySQL query statement below
/*select r.contest_id, Round((count(distinct r.user_id)/(SELECT COUNT(*) FROM Users))*100,2) as percentage
from Register r
right join Users u
on r.user_id = u.user_id
group by r.contest_id
ORDER BY percentage DESC, contest_id ASC;*/

SELECT 
    r.contest_id,
    ROUND(
        (COUNT(DISTINCT r.user_id) / (SELECT COUNT(*) FROM Users)) * 100,
        2
    ) AS percentage
FROM Register r
GROUP BY r.contest_id
ORDER BY percentage DESC, contest_id ASC;
