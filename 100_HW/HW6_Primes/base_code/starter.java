/*
 *	Author:	Niko Tomic
 *  Date:
*/

import java.util.Scanner;

class starter {

	public static boolean checkPrime(int num){
	// int num = x;
	while (num > 0){
		if (num % 2 != 0){ 
			num = num - 1;
			return true;
		}
		else{
			return false;
		}
	// break;
		}
	}

	public static void printPrimes(int x){
	// while (x > 0){
	// 	if (checkPrime == true){
	// 		System.out.println(num);
	// 	}
	// }
	int num = 2;
	while (num < x){
		if (checkPrime(num)){
			System.out.println(num);
		}
	}
	}


	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		// System.out.print("I love to learn coding remotely.");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number and it'll print the prime numbers up until your number: ");
		int x = sc.nextInt();
		
		// printPrime number = new printPrime;
	}
}
