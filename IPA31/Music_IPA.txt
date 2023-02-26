Create a class Music with below attributes:

playListNo - int

type -String

count - int

duration(minutes) -double.



The above attributes should be private.Write Getter and Setter and parametrized constructor as required.

Create class Solution with main method.

****************************************************************************

Implement two static methods: findAvgOfCount and sortTypeByDuration in Solution Class.



findAvgOfCount Method:
----------------------------------------
This method will take an array of Music objects and an int value as input parameters.The method will find out Average 
(as int) of count for those objects whose count is more than the given Count(int parameter passed).This method will return 
average if found.If there is no Type that matches then the method should return 0.

for this method- main method should print average ,if the returned value is not 0.If the returned value is 0 then main method 
should print "No playlist found".

sortTypeByDuration method:
-----------------------------------------
This method will take an array of Music objects and an int value as input parameters.This method should return an array of 
Music objects in an ascending order of their duration which are more than the given duration (int parameter passed) value.
If there are no such objects ,then the method should return null.

for this method-The main method should print the type from the returned Music object array if the returned value is not null.
If the returned value is null then the main method should print "No playlist found with mentioned attribute".

****************************************************************************

Consider the below input and output:

input1:
------------
111
WorkOut
10
15.2
321
Dance Party
20
55.500
721
Childhood Jams
6
50.60
521
Chill
30
78.89
15
20


output1:
--------------------
25
Childhood Jams
Dance Party
Chill



input2:
-----------------------
111
Oldies but Goodies
17
55
321
Guilty Pleasures
27
27
721
night drive
21
345
521
Rainy day
34
21
50
5000


output 2:
-----------------------
No playlist found.
No playlist found with mentioned attribute.

