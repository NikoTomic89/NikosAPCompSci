/*
 *	Author: Niko Tomic
 *  Date: 9-16-24
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		// System.out.print("I love to learn coding remotely."); 
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter 2 numbers to create a range for your random number ");
		System.out.print("Enter the first integer: ");
		int x = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Enter the second integer (bigger than the first #): ");
        int y = sc.nextInt();
        sc.nextLine();
        
        System.out.println("\nYour range is " + x + " to " + y + ".");
        
        System.out.println("Here are 5 numbers generated in that range.");
        
        // int z = (y - x);
        
        int a = ((int)(( Math.random() * (y - x)) + x));
        int b = ((int)(( Math.random() * (y - x)) + x));
        int c = ((int)(( Math.random() * (y - x)) + x));
        int d = ((int)(( Math.random() * (y - x)) + x));
        int e = ((int)(( Math.random() * (y - x)) + x));
        System.out.print(a + ", " + b + ", " + c + ", " + d + ", " + e);
        
		
	}
}
