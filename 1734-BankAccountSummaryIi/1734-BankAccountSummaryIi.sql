-- Last updated: 8/23/2026, 10:40:25 AM
# Write your MySQL query statement below
select u.name,sum(t.amount) balance from users u inner join transactions t on u.account=t.account group by u.account having sum(amount)>10000;