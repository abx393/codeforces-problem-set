import java.util.Arrays;
import java.util.Scanner;

public class ChainReaction {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] pos = new int[n+1];
		int[] pow = new int[n+1];
		for (int i=1; i<n+1; i++){
			pos[i] = sc.nextInt();
			pow[i] = sc.nextInt();
		}
		sc.close();
		int[] dp = new int[n+1];
		for (int i=2; i<n+1; i++){
			int j=i-1;
			int low = 1;
			int hi = j, mid = 0;
			int num = pos[i]-pow[i];
			while (low<=hi) {
				mid = (low+hi)/2;
				if (num<pos[mid]) hi = mid-1;
				else if (num>pos[mid]) low = mid+1;
				else break;
			}
			if (pos[mid]>=num) mid--; 
			dp[i] = i-mid-1 + dp[mid];
		}
		//System.out.println(Arrays.toString(dp));
		int min = Integer.MAX_VALUE;
		for (int i=0; i<=n; i++){
			min = Math.min(min, dp[i]+n-i);
		}
		System.out.println(min);
		
	}
}
