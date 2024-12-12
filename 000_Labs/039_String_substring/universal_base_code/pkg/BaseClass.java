/*
 *	Author:  Niko Tomic
 *  Date: 11/22/24
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {
	

	public BaseClass() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a word.");
		String w = sc.nextLine();
		
		for (int i = 0; i < w.length(); i++){
			System.out.println(i + " " + w.substring(i, i + 1));
		}
		
		
		
		
	}

}

