import java.util.Scanner;

public class permutation {
	static int[] board, state;
	static int n;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		board = new int[n];
		for (int i=0; i<n; i++) board[i] = sc.nextInt();
		sc.close();
		state = new int[n];
		for (int i=0; i<n; i++){
			if (state[i]==0) dfs(i);
		}
		for (int i=0; i<n; i++){
			System.out.print(state[i]==2 ?"A":"B");
		}
		
	}
	public static boolean dfs(int i) {
		if (state[i]==2) return true;
		else if (state[i]==1) return false;
		boolean ret = false;
		for (int j=0; j<n; j++){
			if (board[j]>board[i] && Math.abs(i-j)%board[i]==0){
				ret = !dfs(j);
				if (ret) break;
			}
		}
		state[i] = ret ? 2:1;
		return ret;
	}
}
