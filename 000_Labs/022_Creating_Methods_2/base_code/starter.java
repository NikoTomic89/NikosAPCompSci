/*
 *	Author: Niko Tomic 
 *  Date: 10-17-2024
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static int pow(int x, int y){
		int sum = 1;
		while (y > 0){
			sum = sum * x;
			y--;
		}
		return sum;
	}
	
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a integer");
		int x = sc.nextInt();
		System.out.println("Enter a integer");
		int y = sc.nextInt();
		int sum2 = pow(x, y);
		System.out.print("Your answer is " + sum2);
		
	}
}
