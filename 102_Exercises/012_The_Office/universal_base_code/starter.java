/*
 *	Author: Niko Tomic
 *  Date: 10-22-2024
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();
		
		Employee dwight = new Employee(1987, "Dwight", "Schrute", 4416.66);
		dwight.employeeToString();
		
		Employee jim = new Employee(2474, "Jim", "Halpert", 4416.66);
		jim.employeeToString();
		
		Employee pam = new Employee(2011, "Pam", "Beesly", 2250);
		pam.employeeToString();
		
		Employee nick = new Employee(3232, "Nick", "Bean", 3652.44);
		nick.employeeToString();
		
		michael.raiseSalary(5);
		michael.employeeToString();
		
		michael.getAnnualSalary();
		System.out.println("michael's annual salary is: " + michael.getAnnualSalary());
		
		dwight.getAnnualSalary();
		System.out.println("dwight's annual salary is: " + dwight.getAnnualSalary());
		
		jim.getAnnualSalary();
		System.out.println("jim's annual salary is: " + jim.getAnnualSalary());
		
		pam.getAnnualSalary();
		System.out.println("pam's annual salary is: " + pam.getAnnualSalary());
		
		nick.getAnnualSalary();
		System.out.println("nick's annual salary is: " + nick.getAnnualSalary());
	}
}
