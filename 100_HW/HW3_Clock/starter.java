/*
 *	Author: Niko Tomic
 *  Date:	9-22-24
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		// System.out.print("I love to learn coding remotely.");
		int s = 0;
		int m = 1;
		int t = 2;
		int w = 3;
		int tt = 4;
		int f = 5;
		int ss = 6;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What day is it today?: ");
		int x = sc.nextInt();
		
		if (x == s){
			System.out.print("\nIt's a sunday WAKE UP at 10:00AM! ");
		}
		else if (x == m){
			System.out.print("\nIt's a monday WAKE UP at 7:00AM! ");
		}
		else if (x == t){
			System.out.print("\nIt's a tuesday WAKE UP at 7:00AM! ");
		}
		else if (x == w){
			System.out.print("\nIt's a wednesday WAKE UP at 7:00AM! ");
		}
		else if (x == tt){
			System.out.print("\nIt's a thursday WAKE UP at 7:00AM! ");
		}
		else if (x == f){
			System.out.print("\nIt's a friday WAKE UP at 7:00AM! ");
		}
		else if (x == ss){
			System.out.print("\nIt's a saturday WAKE UP at 10:00AM! ");
		}
		else {
			System.out.print("\nERROR!! ");
		}
	}
}
