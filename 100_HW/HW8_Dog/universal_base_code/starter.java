/*
 *	Author:	Niko Tomic
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Dog test = new Dog();

		if (Dog.isSleeping()) {
            System.out.println(Dog.getName() + " is asleep.");
        } else {
            Dog.bark();
        }

        if (Dog.isSleeping()) {
            if (!Dog.isSleeping()) {
                Dog.bark();
            }
        } else {
            if (!Dog.isSleeping()) {
                Dog.bark();
            }
        }

	}
}
