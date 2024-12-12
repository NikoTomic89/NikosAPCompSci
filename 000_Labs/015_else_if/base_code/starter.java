/*
 *	Author:  Niko Tomic
 *  Date:  9-19-24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		// System.out.print("I love to learn coding remotely."); 
		Scanner sc = new Scanner(System.in);
		int x = ((int)( Math.random() * 1000) + 1);
		
		
		System.out.print("Guess a number between 1 and 1000: ");
		int a = sc.nextInt();
		
		if (a == x){
			System.out.println("\nYou guessed correctly good job!");
		}
		else if (a > x){
			System.out.println("\nYour guess is higher than the number ");
		}
		else if (a < x){
			System.out.println("\nYour guess is lower than the number ");
		}
		else {
			System.out.println("\nYou guessed incorrectly please try again");
		}
	}
}
