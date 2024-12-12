/*
 *	Author:  Niko Tomic
 *  Date:	10-1-24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		int x = ((int)( Math.random() * 1000) + 1);
		
		while (true){
			System.out.print("\nGuess a number: ");
			int guess = sc.nextInt();
			
			if (guess == x){
				System.out.println("You guessed correctly good job!");
				break;
			}
			else if (guess > x){
				System.out.println("Your guess is higher than the number ");
			}
			else if (guess < x){
				System.out.println("Your guess is lower than the number ");
			}
			else {
				System.out.println("You guessed incorrectly please try again");
			}
		}
	}
}
