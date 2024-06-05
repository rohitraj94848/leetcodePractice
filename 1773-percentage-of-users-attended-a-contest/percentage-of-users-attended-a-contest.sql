# Write your MySQL query statement below
select r.contest_id , 
(ROUND(count(r.contest_id)/ (select count(user_id) from Users) * 100,2)) AS percentage
from 
Users u 
join
Register r
on u.user_id  = r.user_id    
group by r.contest_id 
order by percentage  desc , contest_id  asc