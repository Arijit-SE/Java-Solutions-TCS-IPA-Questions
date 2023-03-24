Create a class Student with the following attributes:

name - String
rollNo - String
age - int
gender - char ('M' for male and 'F' for female)
course - String
semester - int
GPA - double

Write getters, setters and parameterized constructor in the above mentioned attribute sequence as required.

Create a class Solution with the main method.

Implement two static methods - calculateAverageGPA and getStudentsByCourse in Solution class.

calculateAverageGPA method:
This method will take an array of Student objects as input.
The method will return the average GPA of all the students in the array.
If the array is empty, the method should return 0.

getStudentsByCourse method:
This method will take two input parameters - array of Student objects and a course (string).
The method will return an array of Student objects that are enrolled in the specified course.
If no student with the given course is present in the array of Student objects, then the method should return an empty array.

These above mentioned static methods should be called from the main method.

For calculateAverageGPA method - The main method should print the average GPA returned by the method.
If the returned value is 0, then it should print "Sorry - No students are available".

For getStudentsByCourse method - The main method should print the name, roll number and GPA of the returned Student objects.
If the returned value is an empty array, then it should print "Sorry - No students are available for the given course".

Before calling these static methods in main, use Scanner object to read the values of four Student objects referring 
attributes in the above mentioned attribute sequence. Next, read the value for a course.

Example Input:
------------------------
John
1234
20
M
CSE
2
3.5
Alice
5678
19
F
EEE
1
3.7
Bob
9101
21
M
CSE
4
3.9
Sarah
2345
20
F
ME
3
3.2
CSE

Example Output:
---------------------------
3.6
John
1234
3.5
Bob
9101
3.9