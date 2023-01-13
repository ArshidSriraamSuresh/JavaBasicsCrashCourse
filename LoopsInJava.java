package BasicsJava;

public class LoopsInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("While, Understanding");
		// while loop
		int clock= 1;
		while (clock<8) {
			String display = dayMapper(clock);
			System.out.println(display);
			clock++;
			}
		
		System.out.println("Do While, Understanding it.");
		// do while loop
		// It executes the code once and then checks for the while condition.
		// Do something before evaluating the condition - Use case for do while loop.
		int clock1= 9;
		do{
			String display = dayMapper(clock1);
			System.out.println(display);
			clock1++;
			}while (clock1<10);
		
		System.out.println("Do While, Reverse");
		// do while loop
		//reverse Sysout.
		int clock3= 8;
		do{
			String display = dayMapper(clock3);
			System.out.println(display);
			clock3--;
			}while (clock3>0);
		
		
		int[] array1 = {1,2,3,4,5};
		String[] array3 = {"a11","b1","c2"};
		
		System.out.println("For loop");
		// Similar to for x in range, accessing using index in Python.
		for (int i =0;i<array1.length;i++) {
			System.out.println(array1[i]);
		}
		
		System.out.println("Enhanced for loop,For each loop");
		//Enhanced for loop.
		// Similar to for x in list in Python.
		for (int j: array1) {
			System.out.println(j);
		}		
		System.out.println("For each loop- String array.");
		for (String j: array3) {// j represents the item and not the index.
			System.out.println(j);
		}	
		
		// Cube numbers
		System.out.println("Cube numbers,For each loop");
		for (int j: array1) {// entire array to get each element : array1
			System.out.println(j*j*j);
		}		
		
		// Nested for loops
		System.out.println("Nested for loops");
		int[][] array5 = {{1,2},{3,4,5}};
		for(int i=0 ; i<array5.length ; i++) {
			for (int j=0 ; j<array5[i].length ; j++) {
				System.out.print(array5[i][j]+ " ");
			}
			System.out.println();
		}
		
		
	}
	public static String dayMapper(int day) {
		String dayAlphabet;
		switch (day) {
		
		case 1:
			dayAlphabet = "Monday";
			break;
		case 2:
			dayAlphabet = "Tuesday";
			break;
		case 3:
			dayAlphabet = "Wednesday";
			break;
		case 4:
			dayAlphabet = "Thursday";
			break;
		case 5:
			dayAlphabet = "Friday";
			break;
		case 6:
			dayAlphabet = "Saturday";
			break;
		case 7:
			dayAlphabet = "Sunday";
			break;
			
		default:
			dayAlphabet = "Not a day";
			break;
			
		}
	    return dayAlphabet;
	}

}
