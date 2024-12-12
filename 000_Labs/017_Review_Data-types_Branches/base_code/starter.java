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
		int point = 0;
		int points = 20;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is your character's name: ");
		String n = sc.nextLine();
		
		System.out.println("What is your character title (Bot or Slayer): ");
		String t = sc.nextLine();
		
		System.out.println("What role would you like to be? Wizard, Warrior, or a Rogue: ");
		String r = sc.nextLine();
		
		if (r.equals("Wizard")) {
			System.out.println("You chose the Wizard class! Enjoy your journey.");		
		}
		if (r.equals("wizard")) {
			System.out.println("You chose the Wizard class! Enjoy your journey.");		
		}
		if (r.equals("Warrior")) {
			System.out.println("You chose the Warrior class! Enjoy your journey.");		
		}
		if (r.equals("warrior")) {
			System.out.println("You chose the Warrior class! Enjoy your journey.");		
		}
		if (r.equals("Rogue")) {
			System.out.println("You chose the Rogue class! Enjoy your journey.");		
		}
		if (r.equals("rogue")) {
			System.out.println("You chose the Rogue class! Enjoy your journey.");		
		}
		
		System.out.println("\nYou have 20 skill points to use for the following: Strength, Dexterity, Intelligence, Charisma.");
		
		System.out.print("\nStrength (1-10): ");
		int s = sc.nextInt();
		int point1 = (points - s);
		System.out.println("You have " + point1 + " left over.");
		
		System.out.print("\nDexterity (1-10): ");
		int d = sc.nextInt();
		int point2 = (point1 - d);
		System.out.println("You have " + point2 + " left over.");
		
		System.out.print("\nIntelligence (1-10): ");
		int i = sc.nextInt();
		int point3 = (point2 - i);
		System.out.println("You have " + point3 + " left over.");
		
		System.out.print("\nCharisma (1-10): ");
		int c = sc.nextInt();
		int point4 = (point3 - c);
		System.out.println("You have " + point4 + " left over.\n");
		
		System.out.println("You are " + n + ", the " + t);
		System.out.println("Here are your stats as a " + r);
		System.out.println("Strength - " + s);
		System.out.println("Dexterity - " + d);
		System.out.println("Intelligence - " + i);
		System.out.println("Charisma - " + c);
		
		System.out.print("\nGood luck on your quest " + n + " the " + r);
		
		
	}
	
}
