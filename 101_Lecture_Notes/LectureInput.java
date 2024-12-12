/* 
    Lecture note example - Input and Scanner
*/
import java.util.Scanner;

class LectureInput{
    public static void main(String args[]) {
        // Your Code Goes here!
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = sc.nextLine();
        
        System.out.println("Hello, " + name);
        
        System.out.println("Enter a number: ");
        int x = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter another number: ");
        int y = sc.nextInt();
        sc.nextLine();
        System.out.println("The sum of your numbers: " + (x + y));
        
        System.out.print("What is your fav food: ");
        String food = sc.nextLine();	}
}