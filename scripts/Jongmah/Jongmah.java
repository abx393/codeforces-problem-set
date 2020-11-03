import java.util.Arrays;
import java.util.Scanner;

public class Jongmah {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		int[] dp = new int[n];
		int max = 0;
		for (int i = 2; i < n; i++){
			dp[i] = Math.max(max, dp[i]);
			int last = 0;
			if (i > 2) last = dp[i - 3];
			if (a[i - 2] == a[i - 1] && a[i - 1] == a[i]) {
				dp[i] = Math.max(dp[i], last + 1);
			}
			if (a[i - 2] + 1 == a[i - 1] && a[i - 1] + 1 ==a[i]) {
				dp[i] = Math.max(dp[i], last + 1);
			}
			max = Math.max(max, dp[i]);
			
		}
		System.out.println(Arrays.toString(dp));
		System.out.println(dp[n - 1]);
	}
}
