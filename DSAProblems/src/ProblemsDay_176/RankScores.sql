--https://leetcode.com/problems/rank-scores/description/

with cte as (Select score ,
DENSE_RANK() over (order by score desc) rn
from Scores)

Select score, rn as 'rank' from cte;