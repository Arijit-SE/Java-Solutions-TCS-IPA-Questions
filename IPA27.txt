Create class Sim2 with below attributes:

id - int
company - String
balance - int
ratePerSecond - double
circle - String

Create class Solution and implement static method "matchAndSort" in the Solution class.

This method will take array of Sim objects, search_circle String and search_rate double as parameters.
And will return another Sim array where the search_circle matches with the circle parameter of the original Sim array and 
the search_rate double is greater than the original array of Sim object's ratePerSecond attribute which is also sorted by 
means of balance attribute in descending order.

Write necessary getters and setters.

Before calling "matchAndSort" method in the main method, read values for four Sim objects referring the attributes in above 
sequence along with a String search_circle and a double search_rate. Then call the "matchAndSort" method and write logic in 
main method to print the id's of the result obtained.

Input
--------------------------
1
jio
430
1.32
mumbai
2
idea
320
2.26
mumbai
3
airtel
500
2.54
mumbai
4
vodafone
640
3.21
mumbai
mumbai
3.4

Output
--------------------------
4
3
1
2