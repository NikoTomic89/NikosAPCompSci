/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {
	

	public BaseClass() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a first name and last name with a space in the middle. ");
		String myName = sc.nextLine();
		
		int space = myName.indexOf(" ");
		
		if (space == -1){
			System.out.println("You didn't put a space!");
		}
		else {
			String myLastName = myName.substring(space + 1);
		
			System.out.print("The last name is: " + myLastName);
		}
	}

}

