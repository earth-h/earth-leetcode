# Write your MySQL query statement below
select e.name Employee
from employee e
where e.salary > (
    select e2.salary
    from employee e2
    where 1 = 1
    and e.managerId = e2.id
);