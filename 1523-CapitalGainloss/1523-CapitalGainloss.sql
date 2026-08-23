-- Last updated: 8/23/2026, 10:40:37 AM
# Write your MySQL query statement below
with cte as (
select stock_name ,
    sum(if(operation='Buy',price,0)) as buy,
    sum(if(operation='Sell',price,0)) as sell
from stocks 
group by stock_name 
) select stock_name,(sell-buy) as capital_gain_loss
from cte
