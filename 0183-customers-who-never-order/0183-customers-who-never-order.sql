select name as Customers from Customers as c1 left join Orders as o1 
on c1.id = o1.customerId where o1.customerId is null;