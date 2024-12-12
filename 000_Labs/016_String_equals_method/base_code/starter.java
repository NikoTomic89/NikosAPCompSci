/*
 *	Author:  Niko Tomic
 *  Date:	9-20-24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		// System.out.print("I love to learn coding remotely."); 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What class would you like to be? Wizard, Warrior, or a Rogue?");
		String r = sc.nextLine();
		
		if (r.equals("Wizard")){
			System.out.println("\nYou have picked the " + r + " class and will start your quest soon.");
		}
		else if (r.equals("wizard")){
			System.out.println("\nYou have picked the " + r + " class and will start your quest soon.");
		}
		
		if (r.equals("Warrior")){
			System.out.println("\nYou have picked the " + r + " class and will start your battle soon!");
		}
		else if (r.equals("warrior")){
			System.out.println("\nYou have picked the " + r + " class and will start your battle soon!");
		}
		
		if (r.equals("Rogue")){
			System.out.println("\nYou have picked the " + r + " class and will start your wild life soon.");
		}
		else if (r.equals("rogue")){
			System.out.println("\nYou have picked the " + r + " class and will start your wild life soon.");
		}
		
		
		
		
	}
}
