package BasicsJava;

public class OperatorsInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// The Simple Assignment Operator
		// sign: =
		// USe case: We can assign values to a variable using = sign.(Simple Assignment operator)
	
		int b1 = 25;
		System.out.println("The Simple Assignment Operator: "+b1);
		
		// Arithmetic Operators
		// Addition +
		int b2 = b1 +8;
		System.out.println("Arithmetic Operator - Addition: "+b2);
		// Also used for String concatenation. Example: System.out.println("Arithmetic Operator - Addition: "+b2);
		
		// Subtraction -
		int b3 = b1 - 10;
		System.out.println("Arithmetic Operator - Subtraction: "+b3);
		
		//Multiplication *
		int b4 = b1 * 11;
		System.out.println("Arithmetic Operator - Multiplication: "+b4);
		
		// Divide /
		int b5 = b1 / 11;
		System.out.println("Arithmetic Operator - Divide: "+b5);
		
		// Modulus * %
		int b6 = 17 % 2;
		System.out.println("Arithmetic Operator - Modulus: "+b6);
		
		// Comparison Operators
		
		int b7 = 12;
		int b8 = 10;
		double b9= 10.5D;
		double b10= 10.0D;
		
		// Greater than >
		System.out.println("Comparison Operator - Greater than: "+(b9>b8));
		// Can compare float or double to int.
		
		// Lesser than <
		System.out.println("Comparison Operator - Less than: "+(b9<b8));
		
		// Greater than equal to >=
		System.out.println("Comparison Operator - Greater than equal to: "+(b8>=b10));
		
		// Lesser than equal to <=
		System.out.println("Comparison Operator - Lesser than equal to: "+(b8<=b10));
		
		// Equal to ==
		System.out.println("Comparison Operator - Equal to: "+(b8==b10));
		
		// Not equal to !=
		System.out.println("Comparison Operator - Not Equal to: "+(b8!=b10));
		
	
		// Logical operators, Conditional Operators
		int b11 = 8;
		int b12 = 8;
		int b13 = 9;
		
		// or ||
		System.out.println("Logical Operator - or: "+(b13>b11||b11>b13));
		System.out.println("Logical Operator - or: "+(9<8||b11>b13));
		
		// and &&
		System.out.println("Logical Operator - and: "+(b11==b12&&b13>b11));
		System.out.println("Logical Operator - and: "+(b11==b12&&b11>b13));
		
		// not !
		System.out.println("Logical Operator - not: "+(!(6>3&&6>2)));
		System.out.println("Logical Operator - not: "+(!(6<2&&2<4)));
		
		// Urnary operator
		
		// Post Increment ++
		int b14 = 10;
		System.out.println("Urnary Operator - Post increment: "+(b14++));
		// +=
		System.out.println("Urnary Operator - +=: "+(b14+=5));
		// Pre increment
		System.out.println("Urnary Operator - Pree increement: "+(++b14));
		int i = 0;
		while (i<5) {
			System.out.println(i);
			i++;
		}
		int j = 0;
		while (j<5) {
			System.out.println(j);
			++j;
		}
		int b = 2;
		int bb = 2;
		int bbb = (b++)+(bb++); // Post increment first 2 then 3
		int bbbb = (b+bb); // Post increment works now
		System.out.println("BBB: "+bbb);
		System.out.println("BBBB: "+bbbb);
		
		int d = 2;
		int dd = 2;
		int ddd = (++d)+(++dd);
		int dddd = (d+dd);
		System.out.println("DDD: "+ddd);// Pre increment works now
		System.out.println("DDDD: "+dddd);
		
	
		// Post Decrement --, -=,j--
		// Pre Decrement --j
		//*=,/=
		
		
		// Bitwise operators in Java.
		// Rarely used.
		// Used for complex bit wise calculations in Java.
		int b15=5;
		int b16 = 7;
		System.out.println("Bitwise - AND: "+(b15&b16)); // Output: 5 AND Gate Logic.
		System.out.println("Bitwise - Exclusive OR: "+(b15^b16)); // Output: 2 XOR Logic gate.
		System.out.println("Bitwise - Inclusive OR: "+(b15|b16));// Output: 7 OR Gate logic.
		
		// left shift bit wise operators
		// Reference: https://www.programiz.com/java-programming/bitwise-operators
		// right shift bit wise operators
		

		
		
	}
	

}
