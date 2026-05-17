//variables are string, int, char, boolean, double, float 
public class 2Variables {
    public static void main(String[] args) {
        String name = "Pooja&Rushi";  // string variable
        int age = 20;           // integer variable
        char grade = 'A';       // character variable
        boolean isStudent = true; // boolean variable
        double height = 5.6;    // double variable
        float weight = 60.5f;   // float variable

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("Is Student: " + isStudent);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
    }
}

//Declare variables with appropriate data types and assign values to them. Then, print the values of the variables to the console.
int a = 10;
double b = 20.5;
String c = "Hello";
System.out.println("Integer: " + a);
System.out.println("Double: " + b);
System.out.println("String: " + c);

// identifiers are the names given to variables, methods, classes, etc. They must start with a letter, underscore, or dollar sign and can be followed by letters, digits, underscores, or dollar signs. They cannot be reserved keywords in Java.
// Good
int minutesPerHour = 60;

// OK, but not so easy to understand what m actually is
int m = 60;

//final variables are constants that cannot be changed once they are assigned a value. They are declared using the final keyword.
final double PI = 3.14159;
System.out.println("Value of PI: " + PI);

//asaan tha haina 