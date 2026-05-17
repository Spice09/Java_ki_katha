//Strings in java 

//To find out string length, use the length() method
String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
System.out.println("The length of the txt string is: " + txt.length());

//To Change the case of a string, use toUpperCase() or toLowerCase() method
String txt = "Hello World";
System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
System.out.println(txt.toLowerCase());   // Outputs "hello world"

//To find out position of a specific character or a substring in a string, use the indexOf() method
String txt = "Please locate where 'locate' occurs!";
System.out.println(txt.indexOf("locate")); // Outputs 7

//To access a character at a specific position in a string, use the charAt() method
String txt = "Hello";
System.out.println(txt.charAt(0));  // H
System.out.println(txt.charAt(4));  // o

//To compare two strings, use the equals() method
String txt1 = "Hello";
String txt2 = "Hello";
String txt3 = "Greetings";
String txt4 = "Great things";

System.out.println(txt1.equals(txt2));  // true
System.out.println(txt3.equals(txt4));  // false

//To remove whitespace from the beginning and end of a string, use the trim() method
String txt = "   Hello World   ";
System.out.println("Before: [" + txt + "]");
System.out.println("After:  [" + txt.trim() + "]");


//Concatination of strings
String name = "Zoro";
int age = 25;
System.out.println("My name is " + name + " and I am " + age + " years old.");

//String ke saath backchodi karne ke liye, use the + operator to concatenate strings and other data types.
String x = "10";
String y = "20";
String z = x + y;  // z will be 1020 (a String)

//Special Characters in java strings 
// \n	New Line	
\t	Tab	
\b	Backspace	
\r	Carriage Return	
\f	Form Feed
String txt = "Hello\nWorld!";
System.out.println(txt);  // Outputs "Hello" and "World!" on separate lines


//kafi sir khuja liya chalo ab math wali backchodi dekhte hai