# Write your MySQL query statement below
select e.name,b.bonus from 
Employee as e left join 
Bonus as b
ON b.empId= e.empId        
WHERE b.bonus < 1000 OR b.bonus IS NULL;