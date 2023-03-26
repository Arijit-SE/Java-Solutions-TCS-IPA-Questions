Create a Class Player with below attributes:

id - int
country - String
side - String
price - double

Write getters, setters and parameterized constructor as required. 

Create class Solution with main method. 

Implement static method - searchPlayerForMatch in Solution class.

This method will take a String parameter along with the other parameter as array of Player objects. 
The method will return array of Player where the String parameter appears in the side attribute (with case insensitive search).

This method should be called from main method and display the id of returned objects in ascending order. 

Before calling this method(searchPlayerForMatch) in the main method, use Scanner object to read values for four Player objects 
referring the attributes in the above sequence, then, read the value for search parameter. 
Next call the method searchPlayerForMatch, write the logic to sort the id in ascending order (in main method) and display the 
result. 

Consider below sample input and output:

Input:
------------
1
India
Batting
2500000
2
Australia
Batting
1000000
3
Srilanka
Bowling
1700000
4
England
Bowling
2000000
Batting

Output:
------------
1
2