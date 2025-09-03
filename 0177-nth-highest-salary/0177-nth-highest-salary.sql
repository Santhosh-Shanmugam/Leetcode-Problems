CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
    RETURN(
    SELECT   DISTINCT E1.salary from Employee E1 where N-1 = (SELECT COUNT(DISTINCT E2.salary) FROM  Employee E2 where E1.salary < E2.salary)
    );
END
