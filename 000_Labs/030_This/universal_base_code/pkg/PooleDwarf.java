/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class PooleDwarf {
	private String name;
	private int age;

	public PooleDwarf() {		// Default Constructor
		this.name = new String("");
		this.age = 0;
	}

	public PooleDwarf(String name, int age){
		// Complete this constructor
		this.name = name;
		this.age = age;
	}

	/*	Accessor Methods */
	public String getName(){
		return this.name;
	}

	public int getAge(){
		return this.age;
	}

	/*	Mutator Methods	*/
	public void setName(String nane){
		// Fix this method
		this.name = name;
	}
	
	public void setAge(int age){
		// Fix this method
		this.age = age;
	}

	public boolean isSameName(String name){
		// Complete this method
		// return this.name.equals(name);
		
		if (this.name == name){
			return true;
		}
		return false;
	}
}
