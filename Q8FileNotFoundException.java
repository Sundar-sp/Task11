package task11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Q8FileNotFoundException {

	public static void main(String[] args) {
		try {
			FileInputStream input= new FileInputStream("C:\\SundarWorkSpace\\Fil.txt");
			int s=0;
			while(s!= -1) {
				
					s=input.read();
					System.out.print((char)s);
				}
			input.close();	
			}
		catch(FileNotFoundException e){
			System.out.println(e);
		}catch (IOException e) {
				System.out.println(e); 
			}
		}
	}


Output:
java.io.FileNotFoundException: C:\SundarWorkSpace\Fil.txt (The system cannot find the file specified)
