/*
 *	Author: Niko Tomic 
 *  Date: 11-21-24
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your pet peeve");
		String p = sc.nextLine();
		
		System.out.print("Did you just say \"" + p + "\" is your pet peeve \b?\t\n        Wow how dare you. \\\\ Get out of here!\f        \r");
		
		

		
	}
}
