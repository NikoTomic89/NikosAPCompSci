/*
 *	Author:  Niko Tomic
 *  Date: 9-17-24
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		// System.out.print("I love to learn coding remotely."); 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int a = sc.nextInt();
		
		System.out.print("Enter another number: ");
		int b = sc.nextInt();
		
		if(a == b){
			System.out.println("\nThese numbers are the same");
		}
		else if (a != b){
			System.out.println("\nThese numbers are different");
		}
		else{
			System.out.println("\nwomp womp you don't understand how to enter a number!");
		}
	}
}
