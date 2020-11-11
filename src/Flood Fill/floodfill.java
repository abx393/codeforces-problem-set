import java.util.ArrayList;
import java.util.Scanner;

public class floodfill {
	public static int[][] turns, val;
	public static ArrayList<Integer> nums;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		nums = new ArrayList<Integer>();
		int prev = -1;
		for (int i = 0; i < n; i++){
			int x = sc.nextInt();
			if (x != prev) nums.add(x);
			prev = x;
		}
		sc.close();
		//System.out.println(nums);
		n = nums.size();
		turns = new int[n][n];
		val = new int[n][n];
		
		System.out.println(solve(0, n - 1)[0] - 1);
	}
	public static int[] solve(int a, int b){
		if (turns[a][b] != 0) {
      return new int[] {turns[a][b], val[a][b]};
    }
		if (a == b) {
			turns[a][b] = 1;
			val[a][b] = nums.get(a);
			return new int[] {1, nums.get(a)};
    } else {
			int tmin = Integer.MAX_VALUE;
			int v = 0;
			int[] s = solve(a, b - 1);
			if (s[1] != nums.get(b)) {
        s[0]++;
      }

			if (s[0] < tmin) {
				tmin = s[0];
				v = s[1];
			} 
			
			s = solve(a + 1, b);
			if (s[1] != nums.get(a)) s[0]++;
			if (s[0] < tmin){
				tmin = s[0];
				v = s[1];
			}
			
			turns[a][b] = tmin;
			val[a][b] = v;
			return new int[] {tmin, v};
		}
	}
}
