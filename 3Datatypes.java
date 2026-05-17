//Datatypes in java are :
//Primitive data types - includes byte, short, int, long, float, double, boolean and char
//Non-primitive data types - such as String, Arrays and Classes

int myNum = 5;               // Integer (whole number)
float myFloatNum = 5.99f;    // Floating point number
char myLetter = 'D';         // Character
boolean myBool = true;       // Boolean
String myText = "Hello";     // String

//byte	Stores whole numbers from -128 to 127
//short	Stores whole numbers from -32,768 to 32,767
//int	Stores whole numbers from -2,147,483,648 to 2,147,483,647
//long	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
//float	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
//double	Stores fractional numbers. Sufficient for storing 15 to 16 decimal digits
//boolean	Stores true or false values
//char	Stores a single character/letter or ASCII values

// Create variables of different data types
int items = 50;
float costPerItem = 9.99f;
float totalCost = items * costPerItem;
char currency = '$';

// Print variables
System.out.println("Number of items: " + items);
System.out.println("Cost per item: " + costPerItem + currency);
System.out.println("Total cost = " + totalCost + currency);


-----------------------------------------------------------------------------------------------------------------------------------------------------
//var keyword lets the compiler automatically detect the type of a variable based on the value you assign to it.
var x = 5;  // x is an int
System.out.println(x); 


-----------------------------------------------------------------------------------------------------------------------------------------------------

//Java typecasting allows you to convert a variable from one data type to another. There are two types of typecasting: implicit and explicit.
//Widening Casting (automatic) - converting a smaller type to a larger type size
//byte -> short -> char -> int -> long -> float -> double
int myInt = 9;
double myDouble = myInt; // Automatic casting: int to double

System.out.println(myInt);    // Outputs 9
System.out.println(myDouble); // Outputs 9.0

//Narrowing Casting (manual) - converting a larger type to a smaller type size
//double -> float -> long -> int -> char -> short -> byte
double myDouble = 9.78d;
int myInt = (int) myDouble; // Manual casting: double to int

System.out.println(myDouble); // Outputs 9.78
System.out.println(myInt);    // Outputs 9

//kafi backchodi karli hai, ab aage badhte hain

