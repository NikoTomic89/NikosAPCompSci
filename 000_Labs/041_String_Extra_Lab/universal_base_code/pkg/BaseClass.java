/*
 *	Author:  Niko Tomic
 *  Date: 12-6-24
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {
	
	public void reverseSentence(String sentence){
	    String reverse = "";
	    
	    while(true){
	        if (sentence.indexOf(" ") == -1){
	            System.out.print(sentence + " ");
	            break;
	        }
	        int space = sentence.indexOf(" ");
	        String word = sentence.substring(0, space);
	        sentence = sentence.substring(space + 1);
	        reverse = (word + " " + reverse);
	    }
	    System.out.print(reverse);
	}
	
	public BaseClass() {
		Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String sentence = sc.nextLine();
        System.out.println("Here's your sentence in reverse");
        reverseSentence(sentence);
	}

}

