/*
 *	Author: Niko Tomic
 *  Date: 11-5-2024
 * 	Collaborator(s): Isaac 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		// int a = ((int)( Math.random() * 10) + 1);
		int [] arr = new int[20];
		System.out.println("These are the 20 numbers");
		
		for (int i = 0; i < arr.length; i++){
			arr[i] = ((int)( Math.random() * 10) + 1);
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("\n--------------------------------------------");
		
		int b = ((int)( Math.random() * 10) + 1); // target
		System.out.println("The random number to look for is " + b);
		
		int copies = 0;
		
		for (int i = 0; i < arr.length; i++){
			if (arr[i] == b){
				System.out.println("Duplicate found at index " + i);
				copies++;
			}
			
		}
		System.out.println("Total number of duplicates for " + b + " is " + copies);
		
		System.out.println("--------------------------------------------");
		
		System.out.println("Looking for two in a row: ");
		
		for (int i = 0; i < arr.length - 1; i++){
			if (arr[i] == arr[i + 1]){
				System.out.println("Two in a row found at indexes " + i + " and " + (i + 1) + " the number is " + arr[i]);
			}
		}
		
		
		
	}
}

