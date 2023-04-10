Create a Class Course with below attributes:

CourseName - String
CourseNumber - int
Mode - String
Sharedata - boolean

Write getters, setters and parameterized constructor as required. 

Create class Solution with main method. 

Implement static method - findCourseStatus in Solution class.

This method will take a String parameter along with the other parameter as array of Course objects. 
The method will return status where the String parameter appears in the side attribute (with case insensitive search).

If the number of the course greater than equal to 1000, print "High", if greater or equal to 500 but less than 1000 then print
"Medium" and if less than 500 then print "Low".

If the taken string not match with the Course name then print "No course found".


Consider below sample input and output:

Input 1:
------------
Java
1200
Online
False
Python
600
Offline
False
HTML
800
Offline
False
JavaScript
300
Online
True
Python

Output 1:
------------
Medium
=========================================
Input 2:
------------
Java
1200
Online
False
Python
600
Offline
False
HTML
800
Offline
False
JavaScript
300
Online
True
PHP

Output 2:
-------------
No course found