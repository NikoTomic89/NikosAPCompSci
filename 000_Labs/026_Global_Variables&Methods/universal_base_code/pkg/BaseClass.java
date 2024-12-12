/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;

public class BaseClass {
	
	public BaseClass() {
		
		myCharacter myRole = new myCharacter();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("What class would you like to be?: ");
		String role = sc.nextLine();
		
		myRole.setRole(role);
		
		myRole.myToString();
		
	}
		
		
class myCharacter{
	
	String role;
	int s = 0;
	int d = 0;
	int i = 0;
	int cc = 0;
	int c = 0;
	
	public myCharacter(){
		System.out.println("Your role is No Role");
		System.out.println("Strength - " + s);
		System.out.println("Dexterity - " + d);
		System.out.println("Intelligence - " + i);
		System.out.println("constitution - " + cc);
		System.out.println("Charisma - " + c);
		System.out.println("------------------");
	}
		
	public void setRole(String role){
		if (role.equals("Wizard") || role.equals("wizard")){
			System.out.println("You've chosen the Wizard! Excelsior!");
		}
		else if (role.equals("Warrior") || role.equals("warrior")){
			System.out.println("You've chosen the Warrior! How wild!");
		}
		else if (role.equals("Rogue") || role.equals("rogue")){
			System.out.println("You picked the Rogue! Beware of your actions... or don't");
		}
		else {
			System.out.println("You decided not to pick a role. You should rerun the program");
		}
	}
		
	public void myToString(){
		System.out.println("Your role is " + role);
		System.out.println("Strength - " + s);
		System.out.println("Dexterity - " + d);
		System.out.println("Intelligence - " + i);
		System.out.println("constitution - " + cc);
		System.out.println("Charisma - " + c);
	}
		
		
		
}


}
