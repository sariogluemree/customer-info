# customer-info
Customer Information Record Application with Doubly Linked List
This is a Java project that implements a customer information record application using a doubly linked list data structure,
in which the customers are sorted alphabetically by their surnames.

General Problem Definition
  The customer information record application will include the name and surname, address, and phone number(s) of each customer.
  The name and surname of the customer will be represented by a variable of type String named adSoyad, and the address information will be represented by a variable of type String named adres.
  Since a customer may have multiple phone numbers, the phone numbers of the customer will be stored in an "ArrayList".

You should create a class named "CustomerInfo" that will hold this information. The class should have a constructor, get/set methods, and a toString method.
You will also write a Node class for the doubly linked list.
In addition to the necessary link fields for the doubly linked list, the Node class will also include a variable of type CustomerInfo.
Note: It is up to you to decide whether to write the Node class as a separate class or as an inner class within the doubly linked list class,
as long as it is clearly stated in the comments.

You are expected to write a class named "DoublyLinkedList" to use the doubly linked list data structure.
To take advantage of the possible advantages of using a doubly linked list, you should define two variables that represent the beginning (head) and end (tail) of the list in your class.
The methods that should be in the doubly linked list class are as follows, associated with the options described below:
  *A method that adds the CustomerInfo object passed as a parameter to the list in a sorted order based on the customer's surname.
  *A method that searches for the customer with the given name and surname in the list and prints their information if they are found.
  *A method that removes the customer with the given name and surname from the list.
  *A method that prints all records in alphabetical order (A to Z) on the screen.
  *A method that prints all records in reverse alphabetical order (Z to A) on the screen.

The following options should be presented to the user in the application:
  1)Read the customer information from the text file named "customer.txt" in the format shown below, separated by commas.
The doubly linked list will be created in memory based on this file.
  Note: The list will be sorted alphabetically by name, and when another person with the same name comes, they will be added in alphabetical order based on their surname.
If there are multiple people with the same name, the last string in the adSoyad variable represents the surname.
  2)Insert a customer whose information is entered from the keyboard into the doubly linked list in the appropriate position in alphabetical order.
  3)Print the information of the customer whose name and surname are entered from the keyboard to the screen.
  4)Remove the customer whose name and surname are entered from the keyboard from the doubly linked list.
  Note: For simplification, it can be assumed that there is no person with the same name and surname.
  5)All records in the list will be printed on the screen in ascending alphabetical order (from A to Z).
  6)All records in the list will be printed on the screen in descending order (from Z to A).
  7)EXIT: The program will exit.
