//Operators are used to perform operations on variables and values.
//Arithmetic operators: +, -, *, /, %
//Assignment operators: =, +=, -=, *=, /=
//Comparison operators: ==, !=, >, <, >=, <=
//Logical operators: &&, ||, !
//Bitwise operators: &, |, ^, ~, <<, >>, >>>
//precedence operation is used when a calculation contains more than one operator,  follows order of operations rules (jaise apna BODMAS rulle hota hai)

//Arithmetic operation-----------------------------------------------------------------------------------
int x = 10;
int y = 3;

System.out.println(x + y); // 13
System.out.println(x - y); // 7
System.out.println(x * y); // 30
System.out.println(x / y); // 3
System.out.println(x % y); // 1

int z = 5;
++z;
System.out.println(z); // 6
--z;
System.out.println(z); // 5


//Assignment operators-----------------------------------------------------------------------------------------
int a = 5;
a += 3; // Same as a = a + 3
System.out.println(a); // 8

a -= 2; // Same as a = a - 2
System.out.println(a); // 6

a *= 2; // Same as a = a * 2
System.out.println(a); // 12

a /= 3; // Same as a = a / 3
System.out.println(a); // 4


//Comparison operators-----------------------------------------------------------------------------------------
int p = 10;
int q = 5;
System.out.println(p == q); // false
System.out.println(p != q); // true
System.out.println(p > q);  // true
System.out.println(p < q);  // false
System.out.println(p >= q); // true
System.out.println(p <= q); // false


//Logical operators-----------------------------------------------------------------------------------------
boolean isLoggedIn = true;
boolean isAdmin = false;

System.out.println("Regular user: " + (isLoggedIn && !isAdmin));
System.out.println("Has access: " + (isLoggedIn || isAdmin));
System.out.println("Not logged in: " + (!isLoggedIn));


//Bitwise operators-----------------------------------------------------------------------------------------
int a = 5; // Binary: 0101
int b = 3; // Binary: 0011

// Bitwise AND: result is 0001 (1 in decimal)
System.out.println("a & b = " + (a & b)); 

// Bitwise OR: result is 0111 (7 in decimal)
System.out.println("a | b = " + (a | b)); 

// Bitwise XOR: result is 0110 (6 in decimal)
System.out.println("a ^ b = " + (a ^ b)); 

// Left Shift: result is 1010 (10 in decimal)
System.out.println("a << 1 = " + (a << 1)); 


//Precedence operation-----------------------------------------------------------------------------------------
int result1 = 2 + 3 * 4;     // 2 + 12 = 14
int result2 = (2 + 3) * 4;   // 5 * 4 = 20

System.out.println(result1);
System.out.println(result2);

//yaha ka plus minus tumne sikha usse kafi alag tha haina koina mehnat karte raho success ek din tumhare kadmo mai ayega, ab aage badhte hain, next topic hai strings ka.