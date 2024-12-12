/*
 *	Author: Niko Tomic
 *  Date: 11 - 5 -24
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		 int [] arr = new int [3003];
		 int i = 3;
		 while (i < 3003){
		 	System.out.print(i + ", ");
		 	arr[i] = 3;
		 	i = i + 3;
		 }
		 System.out.println("\n----------------------------------------------");
		 
		 int [] arr2 = new int[1001];
		 int a = 1000;
		 while (a > 0){
		 	System.out.print(a + ", ");
		 	arr2[a] = 1000;
		 	a--;
		 }
		 
		 //for (int a = 0; a < arr.length; a++){
		 //	arr[a] = (a+1)*3;
		 //	System.out.println("Index: " + a);
		 //}
	}
}
