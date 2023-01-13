package BasicsJava;

public class SwitchStatementJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String day1 = dayMapper(1);
		System.out.println(day1);
		String day2 = dayMapper(2);
		System.out.println(day2);
		String day3 = dayMapper(9);
		System.out.println(day3);
		

	}
	// Multiple if else statements handling in Java.
	// When we have a constant value as a condition rather evaluating a condition.
	public static String dayMapper(int day) {
		String dayAlphabet;
		switch (day) {
		
		case 1:
			// 1 here is a constant, we can't evaluate conditions like a>b && c<d.
			dayAlphabet = "Monday";
			// break; we don't use break because we return
			// If we don't use return break; is mandatory
			// After return statement no line of code will get executed.
			// return dayAlphabet
			break;
			// If you dont use a break it will move on to the next case and overwrite subsequently the values.
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
			
		default:// default is compulsory
			dayAlphabet = "Not a day";
			break;
			
		}
		return dayAlphabet;
	}

}
