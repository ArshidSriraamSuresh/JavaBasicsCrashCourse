package BasicsJava;

class PrimitiveDataTypes
{
    // Global variables 
    // We are using static to access this global variable in the method.
    //static
    static int clause = 34;
    // Global variables will have a default
    static int myAge;
    public static void main(String[]args)
    {
    	// ; is compulsory in Java.
        // Any variables inside a method are known as local variables.
       // System.out.println("Hello World");
       //Declaring a variable
       int age;
       //Assigning a variable
       //= is assignment operator
       age = 20;
       
       System.out.println(age);
       //Declaring and assigning a variable at same Time
       // Re declaration is not allowed
       // int age = 12; this is not allowed. 
       age = 12; //But Reassigning is allowed //Over Riding
       System.out.println(age);
       System.out.println(clause);
       clause = 25; // A global variable can be overwritten inside the method.
       System.out.println(clause);
       // We use camel case for variables, special characters like _ and $ are allowed at the beggining.....
       System.out.println(myAge);
       myAge = 1;
       System.out.println(myAge);
       
       // Primitive Data Types
       // Predefined in Java.....
       //Numbers
       byte a2 = 2;//Range - -128 to 127
       short a3 = 4;//Range - -32768 to 32767
       int a1 = 134555;//Range- -2*10^9
       long a4 = 220000L;//Range +_10^12, 'l' can be used.....

       //Decimal
       float a5 = 22.2F;// We can use 'f' as well.
       double a6 = 22.2;

       //Booleans
       boolean a7 = true;
       boolean a8 = false;


       //Characters
       char a9 = 'A'; // Only use single quotes
       
       
       
       System.out.println("Primitive data Types ");
       System.out.println("global variable: "+a1);
       System.out.println("byte: "+a2);
       System.out.println("short: "+a3);
       System.out.println("long: "+a4);
       System.out.println("Float: "+a5);
       System.out.println("Double: "+a6);
       System.out.println("boolean true: "+a7);
       System.out.println("boolean false: "+a8);
       System.out.println("Char: "+a9);
    }
}