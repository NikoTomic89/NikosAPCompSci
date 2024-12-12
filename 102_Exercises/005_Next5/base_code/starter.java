/*
 *	Author: Niko Tomic
 *  Date: 10-11-24
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
	
		System.out.print("\nEnter a number: ");
        int x = sc.nextInt();
        sc.nextLine();
        
        System.out.println("\nHere are the next 5 numbers: ");
        System.out.println((x) + ", " +(x + 1) + ", " + (x + 2) + ", " + (x + 3) + ", " + (x + 4) + ", " + (x + 5));

        System.out.println("\nHere are the next 5 multiplies of " + x + ": ");
        System.out.println((x) + ", " + (x * 2) + ", " + (x * 3) + ", " + (x * 4) + ", " + (x * 5)+ ", " + (x * 6));

        System.out.println("\nHere is " + x + " divided by 100: ");
        double e = (x / 100.0);
        System.out.println(e);

        System.out.println("\nHere is " + x + " divided by 10: ");
        double f = (x / 10.0);
        System.out.print(f);


	}
}
