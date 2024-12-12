package pkg;

public class CVMath {

	public static void specialSquare(int number){
		int numberOfSquares = 0;
		int i = 1;
		
		while(numberOfSquares < number){
			int sum = i * (i + 1) / 2;

			if (isPerfectSquare(sum)) {
				System.out.println(sum);
				numberOfSquares++;
			}
			i++;
		}
	}
	
	public static boolean isPerfectSquare(int n){
		if (n <= 0) {
			return false;
		}
		for (int i = 1; i * i <= n; i++){
			if (i * i == n){
				return true;
			}
		}
		return false;
	}
	
	
	
	public static int findMid(int one, int two, int three)
	{
		return (one + two + three - Math.min(one,Math.min(two,three)) - Math.max(one,Math.max(two,three)));
	}
	
}
