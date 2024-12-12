/*
 *	Author:  Niko Tomic
 *  Date:	9-19-24
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
		
		System.out.print("Enter another number: ");
		int c = sc.nextInt();
		
		if(a > b){
			if(a > c){
				System.out.println(a + " is the largest int ");
			}
		}
		if (b > a){
			if (b > c){
				System.out.println(b + " is the largest int ");
			}
		}
		if (c > a){
			if (c > b){
				System.out.println(c + " is the largest int ");
			}
		}
		
		if (a < b){
			if (a < c){
				System.out.println(a + " is the smallest int ");
			}	
		}
		if (b < a){
			if (b < c){
				System.out.println(a + " is the smallest int ");
			}
		}
		if (c < a){
			if (c < b){
				System.out.println(a + " is the smallest int ");
			}
		}
		
	}
}
