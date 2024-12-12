/*
 *	Author: Niko Tomic 
 *  Date: Sep 4, 2024
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		// System.out.print("I love to learn coding remotely."); 
		
		int a = Math.max(13 - 6 * 11, 30 % 7 * (-2));		
		System.out.println("A. (13 - 6 * 11, 30 % 7 * (-2)) = " + a);
		
		double b = Math.sqrt(3 * 8 + 31 % 7);
		System.out.println("B. (3 * 8 + 31 % 7) = " + b);
		
		double c = Math.pow(37 / 3, 35 % 21);
		System.out.println("C. (37 / 3, 35 % 21) = " + c);
		
		double d = Math.max( Math.pow(2, 14 % 3) , Math.sqrt(2 * 6) );
		System.out.println("D. ( 2,14 % 3) , ( 2 * 6) ) = " + d);
		
		System.out.print("I like math more than english");
	}
}
