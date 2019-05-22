import java.util.Scanner;

//DP

public class problem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int[] a = new int[n];
		for (int i=0; i<n; i++) a[i] = sc.nextInt();
		sc.close();
		
		int[][] dp = new int[n][2];
		//dp(i, 0) = max(dp(i-1,0), dp(i-1, 1)) if ith element makes it hard
		
		
	}
}
