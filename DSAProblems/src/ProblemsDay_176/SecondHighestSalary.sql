--https://leetcode.com/problems/second-highest-salary/

-- with cte as (Select DISTINCT salary as SecondHighestSalary ,
-- DENSE_RANK() over (order by salary desc) rn
-- from Employee )

-- Select SecondHighestSalary
-- from cte
-- where rn = 2;


SELECT (
  SELECT DISTINCT salary
  FROM Employee
  ORDER BY salary DESC
  LIMIT 1 OFFSET 1
) AS SecondHighestSalary;