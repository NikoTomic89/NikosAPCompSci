/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;

class Character{
	String role = new String("Wizard");
}

public class BaseClass {

	public BaseClass() {
		int s = 6;
		int d = 4;
		int i = 5;
		int c = 5;
		Character myRole = new Character();
		System.out.println("Your role is " + myRole.role);
		System.out.println("Strength - " + s);
		System.out.println("Dexterity - " + d);
		System.out.println("Intelligence - " + i);
		System.out.println("Charisma - " + c);
		
	}

}

