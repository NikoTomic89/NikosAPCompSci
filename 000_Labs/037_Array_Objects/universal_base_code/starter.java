/*
 *	Author:  Niko Tomic
 *  Date: 11-20-24
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Wizard[] wizards = new Wizard[100];
		Warrior[] warriors = new Warrior[100];
		
		for (int i = 0; i < 100; i++){
			warriors[i] = new Warrior("Warrior " + (i + 1));
			wizards[i] = new Wizard("Wizard " + (i + 1));
		}
		
		int aliveWizards  = 100;
		int aliveWarriors  = 100;
		
		int numberOfWizards = 0;
		int numberOfWarriors = 0;
		
		while (aliveWizards > 0 && aliveWarriors > 0){
			Wizard currentWizard = wizards[numberOfWizards];
            Warrior currentWarrior = warriors[numberOfWarriors];
			
			currentWizard.attack(currentWarrior);
			if(currentWarrior.isDead()){
				aliveWarriors--;
                numberOfWarriors++;
                if (aliveWarriors == 0){
                	break;
                }
			}
			else {
				currentWarrior.attack(currentWizard);
				if (currentWizard.isDead()) {
					aliveWizards--;
                    numberOfWizards++;
                    if(aliveWizards == 0){
                    	break;
                    }
				}
			}
		}
		
		if (aliveWizards > 0){
			System.out.println("Wizards have won with " + aliveWizards + " left in their army");
		}
		else {
			System.out.println("Warriors have won with " + aliveWarriors + " left in their army");
		}
	}
}
