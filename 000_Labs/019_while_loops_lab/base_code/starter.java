/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter a name: ");
		String name = sc.nextLine();
		
		System.out.print("how many times do you want the name to be printed?: ");
		int number = sc.nextInt();
		
		int c = 0;
		while (number > c){
			System.out.println(name);
			if(number == c){
				break;
			}
			c = c + 1;
		}
	}
}
