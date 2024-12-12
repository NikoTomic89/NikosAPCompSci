/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {
	public BaseClass() {
		Random rand = new Random();
		int array = rand.nextInt(150) + 51;
		int [] arr = new int [array];
		
		for (int i = 0; i < arr.length; i++){
			arr[i] = rand.nextInt(100) + 1;
		}
		
		int min = arr[0];
		for (int b = 0; b < arr.length; b++){
			if (arr[b] < min){
				min = arr[b];
			}
		}
		
		int max = arr[0];
		for (int a = 0; a < arr.length; a++){
			if (arr[a] > max){
				max = arr[a];
			}
		}
		
		int sum = 0;
		for (int counter = 0; counter < arr.length; counter++){
			sum += arr[counter];
		}
		int average = (sum / arr.length);
		
		System.out.println("There are " + arr.length + " elements");
		System.out.println("The maximum of 1000 random numbers is " + max);
		System.out.println("The minimum of 1000 random numbers is " + min);
		System.out.println("The average of 1000 random numbers is " + average);
	}

}

