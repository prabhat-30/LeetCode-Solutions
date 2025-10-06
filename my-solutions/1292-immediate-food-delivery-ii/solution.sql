# Write your MySQL query statement below
select round(avg(Delivery.order_date=customer_pref_delivery_date )*100,2) as immediate_percentage
from Delivery
where (customer_id,order_date)In(select customer_id,MIN(order_date) from Delivery
group by customer_id);
