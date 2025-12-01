--https://leetcode.com/problems/nth-highest-salary/

CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
      # Write your MySQL query statement below.
    Select distinct salary from (Select salary ,
    DENSE_RANK() over (order by salary desc) rn
    from Employee) as temp
    where rn = N
  );
END