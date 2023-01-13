package BasicsJava;

public class IfElseStatementsInJava {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		char grade1 = marks(100);
		System.out.println("Grade: "+grade1);
		char grade2 = marks(90);
		System.out.println("Grade: "+grade2);
		char grade3 = marks(60);
		System.out.println("Grade: "+grade3);
		char grade4 = marks(45);
		System.out.println("Grade: "+grade4);
		char grade5 = marks(15);
		System.out.println("Grade: "+grade5);
		
		// Example for Nested IF Else Statements.
		char grade6 = ScoreConductValidation(100,75);
		System.out.println("Grade: "+grade6);
		char grade7 = ScoreConductValidation(100,35);
		System.out.println("Grade: "+grade7);
		
		// Ternary Example......
		String grade8 = TernaryExample(75);
		System.out.println("Conduct of the student: "+grade8);
		String grade9 = TernaryExample(49);
		System.out.println("Conduct of the student: "+grade9);
		
		// Explanation of static vs non static.
		//If Non-Static We Want To Create An Object For Particular Class
		//IfElseStatementsInJava NonStatic = new IfElseStatementsInJava();
		//NonStatic.marks(70);
	}
	// There are only methods in Java not functions.
	// Method is a function inside the class.
	public static char marks(int score)
	{
		char grade[]= {'S','A','B','E','F'};
		//if else if follows execution line by line in order.
		
		if (score == 100) {
		return grade[0];
		}
		else if (score>75) {
		return grade[1];
		}
		else if (score<75 && score >50) {
		return grade[2];
		}
		else if (score<50 && score >35) {
		return grade[3];
		}
		else {
		return grade[4];
		}
	}
	//Nested IF ELse Statements
	public static char ScoreConductValidation(int score, int conductScore)
	{// Camel case for variables
		char grade[]= {'S','A','B','E','F'};
		//if else if follows execution line by line in order.
		// if, else nested statements inside if also gets simultaneously executed.
		if (score == 100) {
			if(conductScore>50){
				System.out.println("Conduct is great");
				return grade[0];
			}
			else {
				System.out.println("Conduct is not great");
				return grade[0];
			}
		}
		else if (score>75) {
		return grade[1];
		}
		else if (score<75 && score >50) {
		return grade[2];
		}
		else if (score<50 && score >35) {
		return grade[3];
		}
		else {
		return grade[4];
		}
	}
	// Ternary operator
	//It always returns by default.
	//Syntax: returnVariable = condition?true:false
	// Used only when there is one if statement and an else statement.
		public static String TernaryExample(int conductScore)
		{
			
			String result = (conductScore>50) ? "Conduct is great":"Conduct is not great";
			return result;
			
		}
}




