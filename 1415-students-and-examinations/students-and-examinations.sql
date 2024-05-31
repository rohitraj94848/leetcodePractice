# Write your MySQL query statement below
select s.student_id, 
    s.student_name, 
    sub.subject_name, 
    COUNT(e.subject_name) AS attended_exams
from Students as s 
cross join 
Subjects as sub 
left join Examinations as e
on e.subject_name   = sub.subject_name   
and s.student_id = e.student_id   
GROUP BY 
    s.student_id, s.student_name, sub.subject_name
ORDER BY 
    s.student_id, sub.subject_name;  

