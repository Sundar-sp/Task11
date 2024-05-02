package task11;

import java.util.Scanner;

public class Q4Exception {
	int value;
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			 Q4Exception obj = new Q4Exception();
			 System.out.println("Enter two values: ");
			 obj.division(sc.nextInt(), sc.nextInt());
			 sc.close();
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
	}
	public void division(int firstValue, int secondValue) {
		value=firstValue/secondValue;
		System.out.println("Division of "+firstValue+" and "+secondValue+" is "+ value);
	}
}


Output:
Enter two values: 
30
0
java.lang.ArithmeticException: / by zero
