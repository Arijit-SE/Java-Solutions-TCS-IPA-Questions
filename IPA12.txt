Create class Medicine with below attributes: 

MedicineName - String 
batch - String 
disease - String 
price - int

Create class Solution and implement static method "getPriceByDisease" in the Solution class. 
This method will take array of Medicine objects and a disease String as parameters. 
And will return another sorted array of Integer objects where the disease String matches with the 
original array of Medicine object's disease attribute (case insensitive search).

Write necessary getters and setters.

Before calling "getPriceByDisease" method in the main method, read values for four Medicine objects 
referring the attributes in above sequence along with a String disease. Then call the "getPriceByDisease" 
method and print the result.

Input
-------------

dolo650
FAC124W
fever
100
paracetamol
PAC545B
bodypain
150
almox
ALM747S
fever
200
aspirin
ASP849Q
flu
250
fever

Output
---------
100
200