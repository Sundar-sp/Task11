package task11;

import java.util.Scanner;

public class Q5Exception {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			Q5Exception obj = new Q5Exception();
			try {
				System.out.print("Enter index value of array: ");
				obj.arrayException(sc.nextInt());
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
			try {
				System.out.print("Enter index value of string: ");
				obj.stringException(sc.nextInt());
			} catch (StringIndexOutOfBoundsException e) {
				System.out.println(e);
			}
			sc.close();
	}
	public void arrayException(int index) {
		int a[] = new int[3];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		System.out.println(a[index]);
	}
	public void stringException(int index) {
		String s="ram";
		System.out.println(s.charAt(index));
	}

}



Output:
Enter index value of array: 5
java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3
Enter index value of string: 5
java.lang.StringIndexOutOfBoundsException: String index out of range: 5

