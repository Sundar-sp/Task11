package task11;

import java.util.Scanner;

public class Q7Age {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Q7Age obj =new Q7Age();
		try {
			System.out.print("Enter age: ");
			obj.ageCalc(sc.nextInt());
		} catch (Q7InvalidAgeException e) {
			System.out.println(e);
		}
		sc.close();
	}
	public void ageCalc(int age) throws Q7InvalidAgeException {
		if (age>60) {
			System.out.println("Senior citizen");
		}else if(age>30){
			System.out.println("Middle Age");
		}else if(age>18) {
			System.out.println("Adult");
		}else {
			throw new Q7InvalidAgeException("Invalid Age Exception");
		}
	}

}



Output:
Enter age: 15
task11.Q7InvalidAgeException: Invalid Age Exception
