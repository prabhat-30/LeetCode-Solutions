# Write your MySQL query statement below
select v.customer_id,count(*)AS count_no_trans
from Visits v Left join Transactions t
on v.visit_id = t.visit_id
where t.transaction_id IS NULL
Group BY v.customer_id;
