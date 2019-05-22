import java.util.Scanner;

//Fenwick Tree

public class greg {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[n+1];
		for (int i=1; i<n+1; i++) a[i] = sc.nextInt();
		int[][] ops = new int[m][3];
		for (int i=0; i<m; i++){
			ops[i][0] = sc.nextInt();
			ops[i][1] = sc.nextInt();
			ops[i][2] = sc.nextInt();
		}
		
		for (int i=0; i<k; i++){
			int x = sc.nextInt()-1;
			int y = sc.nextInt()-1;
			
			for (int j=x; j<=y; j++){
				int idx = ops[j][0];
				while (idx<n+1) {
					a[idx]+=ops[j][2];
					idx += idx & -idx;
				}
				idx = ops[j][1]+1;
				while (idx<n+1){
					a[idx]-= ops[j][2];
					idx += idx & -idx;
				}
			}
		}
		for (int i=1; i<n; i++){
			int ret = 0;
			for (int j=i; j>0; j -= j & -j){
				ret += a[j];
			}
			System.out.print(ret + " ");
		}
		System.out.print(a[n]);
		sc.close();
	}
}
