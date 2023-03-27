Create a class Bill with below attributes:

billNo- int
name - String
typeOfConnection - String
billAmount - double
status – boolean

where billNo is the bill number, name is the name of the customer, typeOfConnection is the type of the connection 
(prepaid, postpaid), billAmount is the bill amount and status is whether the bill is paid or not (if paid then value is TRUE 
else value is FALSE). 

The above attributes should be private, write getters, setters and parameterized constructor as required. 

Create class Solution with main method.
Implement two static methods - findBillWithMaxBillAmountBasedOnStatus and getCountWithTypeOfConnection in Solution class.

findBillWithMaxBillAmountBasedOnStatus method:
-----------------------------------------------------
This method will take an array of Bill objects and a boolean parameter as parameters. 
The method will return bill object array in ascending order of their bill number from the array of Bill objects whose bill 
amount is maximum in the array with the status attribute that matches with the input parameter.

If no Bill with the given status is present in the array of Bill objects, then the method should return null.

getCountWithTypeOfConnection method:
-----------------------------------------------------
This method will take two input parameters - array of Bill objects and string parameter ( for type of connection).
The method will return the count of bills from array of bill objects for the given type of connection.
If no bill with the given type of connection is present in the array of bill objects, then the method should return 0.


Note :

Two bill object can have the same bill amount.
All the searches should be case insensitive. 

The above mentioned static methods should be called from the main method.

For findBillWithMaxBillAmountBasedOnStatus method - The main method should print the billNo followed by # and name from the 
returned Bill object array if the returned value is not null.

If the returned value is null then it should print "There are no bill with the given status".

For getCountWithTypeOfConnection method - The main method should print the count of bills as it is, if the returned value is 
greater than 0,  otherwise it should print "There are no bills with given type of connection".

Before calling these static methods in main, use Scanner to read the number of object and objects to read the values of Bill 
objects referring attributes in the above mentioned attribute sequence. 

Next, read the value for status and typeOfConnection.


Consider below sample input and output:
Input:

4
111
Aman Mittal
Prepaid
914.25
true
222
Rekha Kumar
Prepaid
1425.75
false
333
Samyra Gupta
Prepaid
1305.00
true
444
Mohit Saxena
Postpaid
1300.50
false
false
Prepaid

Output:

222#Rekha Kumar
3
*************************************************************************************
--------------------------------------------------
Sample code snippet for reference:
Please use below code to build your solution.
--------------------------------------------------

import java.util.Scanner;
public class Solution
{
public static void main(String[] args)
{
//code to read values

//code to call required method

//code to display the result

}

public static Bill[] findBillWithMaxBillAmountBasedOnStatus( /* required parameters to be added */ ) {
//method logic
}
public static int getCountWithTypeOfConnection( /* required parameters to be added */ ) {
//method logic
}
}
class Bill
{
//code to build the class
}

-------------------------------------------------
Note on using Scanner object:
Sometimes scanner does not read the new line character while invoking methods like nextInt(), nextDouble() etc. 
Usually, this is not an issue, but this may be visible while calling nextLine() immediately after those methods.


Consider below input values:

1234
Merin Bakers

Referring below code:

Scanner sc = new Scanner(System.in);
int x = sc.nextInt();
String str = sc.nextLine(); -> here we expect str to have value Bakers name. Instead it may be "".

If above issue is observed, then it is suggested to add one more explicit call to nextLine() after reading numeric value.