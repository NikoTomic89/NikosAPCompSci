/*
 *	Author:  Niko Tomic
 *  Date: 11-12-24
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {
	

	public BaseClass() {
		myCharacter character = new myCharacter();
		
		character.myToString();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("What class would you like to be?: ");
		String role = sc.nextLine();
		
		character.setRole(role);
		character.myToString();
	}

}

class myCharacter {
	
	String role = "No Role";
	int strength = 0;
	int dexterity = 0;
	int intelligence = 0;
	int constitution = 0;
	int charisma = 0;
	
	public void setRole(String role){
		if (role.equals("Wizard") || role.equals("wizard")){
			this.role = "Wizard";
			System.out.println("You've chosen the Wizard! Excelsior!");
		}
		else if (role.equals("Warrior") || role.equals("warrior")){
			this.role = "Warrior";
			System.out.println("You've chosen the Warrior! How wild!");
		}
		else if (role.equals("Rogue") || role.equals("rogue")){
			this.role = "Rogue";
			System.out.println("You picked the Rogue! Beware of your actions... or don't");
		}
		else {
			System.out.println("You decided not to pick a role. You should rerun the program");
		}
	}
	
	public void myToString() {
		System.out.println("Your role is " + role);
		System.out.println("Strength - " + strength);
		System.out.println("Dexterity - " + dexterity);
		System.out.println("Intelligence - " + intelligence);
		System.out.println("Constitution - " + constitution);
		System.out.println("Charisma - " + charisma);
		System.out.println("------------------");
	}
	
	public void setStrength(int strength){
		if (strength < 0){
			strength = 0;
		}
	}
	
	public void setDexterity(int dexterity){
		if (dexterity < 0){
			dexterity = 0;
		}
	}
	
	public void setIntelligence(int intelligence){
		if (intelligence < 0){
			intelligence = 0;
		}
	}
	
	public void setConstitution(int constitution){
		if (constitution < 0){
			constitution = 0;
		}
	}
	
	public void setCharisma(int charisma){
		if (charisma < 0){
			charisma = 0;
		}
	}
	
	public boolean setAll(String role, int strength, int dexterity, int intelligence, int charisma){
		setRole(role);
        setStrength(strength);
        setDexterity(dexterity);
        setIntelligence(intelligence);
        setCharisma(charisma);
        return true;
	}
}

