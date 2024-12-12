/*
 *	Author:	Niko Tomic
 *  Date:
 *	Collaborator(s):
*/

import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a message you want to decipher");
		String text = sc.nextLine();
		
		String encode(String);
		String keyedEncode(String, int);
	}
}
