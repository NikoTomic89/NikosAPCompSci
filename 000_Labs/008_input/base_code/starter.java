/*
 *	Author: Niko Tomic 
 *  Date: Sep 3, 2024
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		// System.out.print("I love to learn coding remotely."); 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is your first name? ");
		String cat = sc.nextLine();
		
		System.out.print("What is your age? ");
		int number = sc.nextInt();
		
		System.out.print("What is your birthday month? ");
		int number2 = sc.nextInt();
		
		System.out.print("What is your birthday day? ");
		int number3 = sc.nextInt();
		
		System.out.print("What is your birthday year? ");
		int number4 = sc.nextInt();
		
		System.out.print("How much is a buck fifty? ");
		double number5 = sc.nextDouble();
	}
}
