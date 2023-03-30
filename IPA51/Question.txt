Create a class Beach with the below attributes: 
beachId - int 
beachName - String 
beachRating - int 
beachCost - int
Write getters, setters and parameterized constructor in the above mentioned attribute sequence as required.

Create class Solution with the main method.
Implement two static methods - findLeastRatingWithName in Solution class.

findLeastRatingWithName method: 
-----------------------------------
This method will take three input parameters - array of Beach objects and string parameter and a int parameter. The method 
will return the minimum rating attribute from beach objects whose name is matched with string parameter and whose amount
is greater than the int parameter. If no data found of beach objects, then the method should return 0.

Note : All the searches should be case insensitive.

These above mentioned static methods should be called from the main method.
For findLeastRatingWithName method - The main method should print the least rating from the beach array. If return 0, then
you should print "No beach found".

Input ->
1001
Puri
3
8600 
1002
Digha
5
6200
1003
Digha
3
4000
1004
Digha
4
5500
digha
5000

Output ->
4