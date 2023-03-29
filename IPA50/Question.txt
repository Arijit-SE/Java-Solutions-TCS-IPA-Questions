Create a class called BankAccount with the following attributes:

accountNumber (String)
accountHolderName (String)
balance (double)
Write getters, setters, and a parameterized constructor for the class.

Create a static method transferFunds in a separate class called BankUtils. The method should take four parameters:

fromAccount (BankAccount)
toAccount (BankAccount)
amount (double)
transactionCode (String)
The method should transfer the specified amount from the fromAccount to the toAccount,
and return a Transaction object containing the transactionCode, the amount 
transferred, and the timestamp of the transaction. If the fromAccount has insufficient
balance, the method should throw an InsufficientBalanceException with an appropriate error message.

Create a class called Transaction with the following attributes:

transactionCode (String)
amount (double)
timestamp (String)
Write getters and a parameterized constructor for the class.

Create an InsufficientBalanceException class that extends the Exception class. 
The exception should have a constructor that takes a message as a parameter.

In the main method, create two BankAccount objects, transfer some funds between 
them using the transferFunds method, and print the transaction details to the console. Handle any exceptions.

Sample Input:

Account 1:
Account Number: 12345
Account Holder Name: John
Balance: 5000.0

Account 2:
Account Number: 67890
Account Holder Name: Jane
Balance: 10000.0

Transfer Details:
Amount: 2000.0
Transaction Code: T0001

Sample Output:

Before Transfer:
Account 1: John - 12345 - 5000.0
Account 2: Jane - 67890 - 10000.0

After Transfer:
Account 1: John - 12345 - 3000.0
Account 2: Jane - 67890 - 12000.0

Transaction Details:
Transaction Code: T0001
Amount Transferred: 2000.0
Timestamp: 2023-04-01 10:30:00