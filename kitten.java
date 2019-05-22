import java.util.Scanner;

public class kitten {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt(), x = sc.nextInt();
		int[] a = new int[n];
		for (int i=0; i<n; i++) a[i] = sc.nextInt();
		sc.close();
		
		int min = (int) Math.ceil ((double)n/k);
		if (min>x) {
			System.out.println(-1);
			return;
		}
		int[][] dp = new int[n+1][x+1];
		for (int i=1; i<=x; i++){
			int prev = 0;
			for (int j=1; j<=n; j++){
				if (i>j) continue;
				int s1 = dp[j-1][i-1] + a[j];
				int s2 = dp[j-1][i];
				if (s1>s2) {
					
				}
			}
		}
	}
}
