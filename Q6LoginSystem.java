package task11;

import java.util.Scanner;

public class Q6LoginSystem {

	public static void main(String[] args) {
		String userName= "tester";
		String password= "Test@123";
		String matchPassword;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Password: ");
		matchPassword= sc.nextLine();
		sc.close();
		
		try {
			if (password.equals(matchPassword)) {
				System.out.println("Login Successfully");
			}else {
				System.out.println("Incorrect Password");
			}
		} catch (Exception e) {
			System.out.println(e);
	}
	}
}


Output:
Enter Password: ;kj;k
Incorrect Password
