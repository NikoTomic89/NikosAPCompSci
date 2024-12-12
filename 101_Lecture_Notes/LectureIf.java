/* 
    Lecture note example - If Statements
*/
import java.util.Scanner;

class LectureIf{
    public static void main(String args[]) {
        // Your Code Goes here!
        
        Scanner sc = new Scanner(System.in);
        System.out.println("You’re a student who’s decided to get serious about fitness. Today is your first day at the local gym, and you’re excited but a bit nervous.");
        System.out.println("1. Do some cardio!");
        System.out.println("2. Head to the weight room!");
        System.out.println("3. Join a group class!");
        
        int answer1 = sc.nextInt(); //1, 2, or 3
        
        if (answer1 == 1){
            System.out.println("You make your way to the the stairmaster");
            System.out.println("After doing a painful 20 minutes of stairmaster you deside to try doing something else");
            System.out.println("1. Head over to the weight room\n2. Head over to the zumba class\n3. Keep doing cardio");
            int answer2 = sc.nextInt();
            if (answer2 == 1){
                System.out.println("You head over to the weight room and are trying to figure out to hit");
            }
            else if (answer2 == 2){
                System.out.println("You make your way to the zumba class and meet a lot of single women");
            }
            else if (answer2 == 3){
                System.out.println("You switch to the treadmill");
            }
            else {
                System.out.println("You sit there and do nothing");
            }
        }
        else if (answer1 == 2){
            System.out.println("You make your way to lift some soild weights");
            System.out.println("1. Push day\n2. Pull day\n3. Leg day");
            int answer3 = sc.nextInt();
            if (answer3 == 1){
                System.out.println("You start with with bench press");
            }
            else if (answer3 == 2){
                System.out.println("You start with seated rows");
            }
            else if (answer3 == 3){
                System.out.println("You start with some leg press");
            }
        }
        else if (answer1 == 3){
            System.out.println("You make your way to the zumba class");
            System.out.println("After 10 minutes you leave the gym and go home");
        }
        else {
            System.out.println("Why did you choice to go to the gym if you aren'g going to do anything?");
        }
        
	}
}