Create a class Car with the below attributes:

carId – int
carName – String
fuelType – String

The above attributes should be private, write getters, setters and parameterized constructor as required.

Create class RemoveCar with main method.

Implement two static methods – RemoveAndRearrange in RemoveCar class.

RemoveAndRearrange method: 
This method will take int input parameter. The method will return the new array of Car object and remove that car whose 
id is match with the input parameter. Remove the car details and return the array with continuous new ids.

If no car with the given id is present in the array of Car objects, then the method should return null.

Note: No two Car object would have the same engine id.

The above mentioned static methods should be called from the main method.

For RemoveAndRearrange method: The main method should print the id and car name as it is, if the returned 
value is not null, or it should print “There are no car with given id”. 

Before calling these static methods in main, use Scanner object to read the values of five objects referring attributes 
in the above mentioned attribute sequence. next, read the value of int parameters for capturing car id.

Input :

1001
Maruti
Diesel
1002
Kia
Pertro
1003
Hyundai
Diesel
1004
Taxi
Petrol
1005
Truck
Diesel
1003

Output :

1001 : Maruti
1002 : Kia
1003 : Hyundai
1004 : Taxi