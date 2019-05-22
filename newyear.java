import java.util.Scanner;

//DP

public class newyear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		//dp(k) = dp(k-1) if last n elements do not sum to n(n+1)/2
		//dp(k) = dp(k-1) + 1 if last n elements DO sum to n(n+1)/2
		int[][] dp = new int[n+1][2];
		
	}
}
