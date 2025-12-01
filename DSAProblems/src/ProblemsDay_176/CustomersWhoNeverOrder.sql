--https://leetcode.com/problems/customers-who-never-order/

-- Select name  as Customers
-- from Customers
-- where id not in (Select c.id
-- from Customers c inner join Orders o on c.id = o.customerId)

Select c.name as Customers
from Customers c left join Orders o on c.id = o.customerId
where o.customerId is null