import java.util.Scanner;  
import pkg.*;

class starter {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter how many magic squares you want to see: ");
		int number = scanner.nextInt();
		
		CVMath.specialSquare(number);  
		
		System.out.println("The middle value of 2, 3, and 1 is: " + CVMath.findMid(2,3,1));
	}
}
