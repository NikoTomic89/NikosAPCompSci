/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


class Character{
	String role = new String("No Role");
	
	public Character(){
		System.out.println("Your role is " + role);
		System.out.println("Strength - " + 0);
		System.out.println("Dexterity - " + 0);
		System.out.println("Intelligence - " + 0);
		System.out.println("Charisma - " + 0);
		System.out.println("------------------");
	}
}

public class BaseClass {
	
	public BaseClass() {
		int s = 6;
		int d = 4;
		int i = 5;
		int c = 5;
		
		Character myRole = new Character();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("What class would you like to be?: ");
		String role2 = sc.nextLine();
		
		if (role2.equals("Wizard") || role2.equals("wizard")){
			System.out.println("You've chosen the Wizard! Excelsior!");
		}
		else if (role2.equals("Warrior") || role2.equals("warrior")){
			System.out.println("You've chosen the Warrior! How wild!");
		}
		else if (role2.equals("Rogue") || role2.equals("rogue")){
			System.out.println("You picked the Rogue! Beware of your actions... or don't");
		}
		else {
			System.out.println("You decided not to pick a role. You should rerun the program");
		}
		
		System.out.println("Your role is " + role2);
		System.out.println("Strength - " + 0);
		System.out.println("Dexterity - " + 0);
		System.out.println("Intelligence - " + 0);
		System.out.println("Charisma - " + 0);
		
	}

}	

