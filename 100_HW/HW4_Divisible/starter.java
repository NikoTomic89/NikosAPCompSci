/*
 *	Author:	Niko Tomic
 *  Date: 9-29-24
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		// System.out.print("I love to learn coding remotely.");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int x = sc.nextInt();
		
		System.out.print("Enter another number: ");
		int y = sc.nextInt();
		
		System.out.println(" ");
		if (x % 2 == 0){
			System.out.println( x + " can be divisible by 2.");
		}
		if (x % 2 != 0){
			System.out.println(x + " can NOT be divisible by 2.");
		}
		if (x % 3 == 0){
			System.out.println(x + " can be divisible by 3.");
		}
		if (x % 4 == 0){
			System.out.println(x + " can also be divisible by 4.");
		}
		if (x % 5 == 0){
			System.out.println(x + " can be divisible by 5.\n");
		}
		if (x % 3 != 0 && x % 4 != 0 && x % 5 != 0) {
			System.out.println(x + " can NOT be divisible by 3,4, and 5.\n");
		}
		
		System.out.println(" ");
		if (y % 2 == 0){
			System.out.println(y + " can be divisible by 2.");
		}
		if (y % 2 != 0){
			System.out.println(y + " can NOT be divisible by 2.");
		}
		if (y % 3 == 0){
			System.out.println(y + " can be divisible by 3.");
		}
		if (y % 4 == 0){
			System.out.println(y + " can also be divisible by 4.");
		}
		if (y % 5 == 0){
			System.out.println(y + " can be divisible by 5.\n");
		}
		if (y % 3 != 0 && y % 4 != 0 && y % 5 != 0) {
			System.out.println(y + " can NOT be divisible by 3,4, and 5.\n");
		}
		
		
		
		
		
		
	}
}
