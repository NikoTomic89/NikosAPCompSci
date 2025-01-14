/*
   * Author: Niko Tomic
   * Date: 12 - 3 - 24
   * Collaborator(s):
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String sentence = sc.nextLine();
        System.out.println("Here's your sentence in pig latin!");
        
        while(true){
        	if(sentence.indexOf(" ") == -1){
        		System.out.print(pigLatin(sentence) + " ");
        		break;
        	}
        	int space = sentence.indexOf(" ");
        	String word = sentence.substring(0, space);
        	System.out.print(pigLatin(word) + " ");
        	
        	sentence = sentence.substring(space + 1);
        }
	}
	
    public static String pigLatin(String word){
        String vowels = "AEIOaeio";
		String result = "";
        
        if (vowels.indexOf(word.substring(0,1)) != -1){
            result = word + "-way";
        }
        else {
            int vowelIndex = -1;
            for(int i = 0; i < word.length(); i++){
                String letter = word.substring(i, i + 1);
                if(vowels.indexOf(letter) != -1){
                    vowelIndex = i;
                    break;
                }
            }
            if (vowelIndex != -1){
                result = word.substring(vowelIndex) + "-" + word.substring(0, vowelIndex) + "ay";
            }
            else {
                result = word + "-ay";
            }
        }
        return result;
	}     
}
