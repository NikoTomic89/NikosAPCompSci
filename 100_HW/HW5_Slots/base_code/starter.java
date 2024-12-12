/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		// System.out.print("I love to learn coding remotely."); 
		// int x = ((int)( Math.random() * 9) + 1);
		// int y = ((int)( Math.random() * 9) + 1);
		// int z = ((int)( Math.random() * 9) + 1);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Slot Machine Rules:");
		System.out.println("1. Players start with $100 ");
		System.out.println("2. Input your wager less than your total amount of money ");
		System.out.println("3. Each slot machine rolls 3 numbers from 1 to 10 ");
		System.out.println("	a) If two numbers match, your money doubles");
		System.out.println("	b) If three numbers match, your money triples");
		System.out.println("	c) If nothing matches, you lose your money");
		
		int money = 100;
		
		while (money > 0){
			
			System.out.print("\nWould you like to play some slots? (Yes,yes,Y,y): ");
			String p = sc.nextLine();
			
			if (p.equals("Yes") || p.equals("yes") || p.equals("Y") || p.equals("y")){
				
				System.out.print("Your balance is " + money + ". How much would you want to wager? ");
				int bet = sc.nextInt();
				sc.nextLine();
				
				int x = ((int)( Math.random() * 9) + 1);
				int y = ((int)( Math.random() * 9) + 1);
				int z = ((int)( Math.random() * 9) + 1);
		
				System.out.println("Your rolls are:\n_______________");
				System.out.println(" | " + x + " | " + y + "  | " + z + " |");
				System.out.println("_______________");
				
				// int bet2 = bet * 2;
				// int bet3 = bet * 3;
				money = money - bet;
				if (x == y && y == z){
					System.out.println("You WON!! Nicely done, you tripled your money");
					System.out.println("You now have " + "$" + money);
				}
				else if (x == y && y != z){
					System.out.println("You WON!! Nicely done, you doubled your money");
					System.out.println("You now have " + "$" + money);
				}
				else {
					System.out.println("You didn't win this time, better luck next time");
					System.out.println("You now have " + "$" + money);
				}
				
				
			}
			
			if (p.equals("No") || p.equals("no") || p.equals("N") || p.equals("n")){
				System.out.print("Sad to see you leave but do come again soon. Your balance is " + money);
				break;
			}
		}
	}
}
