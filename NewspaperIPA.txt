Create a class newspaper with below attributes.


regNo-int

name-String

publicationYear-int

price-int



Write parametrised constructor as required.



Create class Solution with main method.

Implement 2 static methods findTotalPriceByPublicationYear and 

searchNewspaperByName in solution class.



findTotalPriceByPublicationYear method:

   This method will take array of the Newspaper objects and int parameter

type.This method will return the total price of newspapers from array of 

Newspaper objects,If the publication year attribute matches with the int 

parameter passed .If no Newspaper with the given publication year is present 

in the array ,then the method should return 0.



The main method should print total price if the returned value is greater 

than 0.Else it should print "No Newspaper found with the mentioned attribute".




searchNewspaperByName method :

   This method will take the array of the Newspaper objects and the String 

parameter type.This method will return the Newspaper object from the Array

of Newspaper objects,If the name attribute matches with the string 

parameter passed.

If no Newspaper with the given name is present in the array ,then the 

method should return null.



The main method should print the regNo,name,year of publication,and price 

if the returned Newspaper object is not null.

else it should print "No Newspaper found with the given name."





The above mentioned static methods should be called from main method.




**************************************************************************************************

input1:



134
Evening Mail
2018
79
178
Morning Mail
2017
65
176
Daily News
2017
98
219
Times of India
1988
15
2017
Times of India





output1:

163

regNo-219

name-Times of India

publicationYear-1988

price-15









input2:



201

Afternoon Mail

2019

79

202

Morning Mail

2014

65

156

Daily News

2004

98

278

Times of India

1967

15

2017

Times of America





output2:

No Newspaper found with the mentioned attribute

No Newspaper found with the given name