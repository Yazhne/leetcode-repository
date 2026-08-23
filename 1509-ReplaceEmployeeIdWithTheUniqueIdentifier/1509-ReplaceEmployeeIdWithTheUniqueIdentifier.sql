-- Last updated: 8/23/2026, 10:40:39 AM
# Write your MySQL query statement below
-- Write your Oracle SQL query statement below
select unique_id, name 
from Employees
left join EmployeeUNI 
on Employees.id = EmployeeUNI.id;