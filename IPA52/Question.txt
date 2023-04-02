Create a class Employee with the below attributes: 
EmpId - int 
EmpName - String 
Dept - String
Rating - int
Salary - int

Write getters, setters and parameterized constructor in the above mentioned attribute sequence as required.

Create class Solution with the main method.

Implement two static methods - findDept and findSecondHighestSalary in Solution class.

findDept method: 
-----------------------------------
This method will take two input parameters - array of Employee objects and int parameter. The method 
will return the dept array attribute from employee objects whose salary is matched with int parameter and rating greater than
equal to 3. If no data found of beach objects, then the method should return null.

findSecondHighestSalary method: 
-----------------------------------
This method will take two input parameters - array of Employee objects and string parameter. The method
will return the second highest salary from employee objects whose dept is matched with string parameter. 
If no data found of beach objects, then the method should return 0.

Note: No two employees have same rating. All the searches should be case insensitive.

These above mentioned static methods should be called from the main method.
For findDept method - The main method should print the dept from the Employee array. If return null, then you should print 
"No Department found".
For findSecondHighestSalary method - The main method should print the 2nd highest salary from the Employee array with 
the following condition. If return 0, then you should print "No data found".


Input ->
101
Arijit
Computer
4
35000
102
Rakesh
Electronics
2
18000
103
Mahima
Mechanical
3
35000
104
Saniya
Mechanical
5
68000
105
Rajesh 
Computer
1
30000
35000
Mechanical

Output ->
Computer, Mechanical
35000