import java.util.HashSet;
import java.util.Scanner;

//String hashing problem
//2/13/19
public class hashingdivisors {
	public static long MOD = 1000000007L;
	//999999999989L
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		sc.close();
		long h = hash(s1);
		long hash = 0;
		HashSet<Long> h1 = new HashSet<Long>();
		for (int i=0; i<s1.length(); i++){
			long add = ((s1.charAt(i)-96)*exp(27, i))%MOD;
			hash +=add;
			hash %= MOD;
			long newhash = 0;
			if (s1.length()%(i+1)==0) {
				int factor = s1.length()/(i+1);
				for (int j=0; j<factor; j++){
					long tmp = (hash*exp(27, (i+1)*j))%MOD;
					newhash += tmp;
					newhash %= MOD;
				}
				if (newhash==h){
					h1.add(hash);
				}
			}
		}
		//System.out.println(h1.size());
		int count = 0;
		h = hash(s2);
		hash = 0;
		
		for (int i=0; i<s2.length(); i++){
			long add = ((s2.charAt(i)-96)*exp(27, i))%MOD;
			hash +=add;
			hash %= MOD;
			long newhash = 0;
			if (s2.length()%(i+1)==0) {
				int factor = s2.length()/(i+1);
				for (int j=0; j<factor; j++){
					long tmp = (hash*exp(27, (i+1)*j))%MOD;
					newhash += tmp;
					newhash %= MOD;
				}
				if (newhash==h){
					//System.out.println(s2.substring(0, i+1));
					int size = h1.size();
					h1.add(hash);
					if (h1.size()==size) count++;
				}
			}
		}
		//System.out.println(h1.size());
		System.out.println(count);
	}
	public static long hash(String s){
		long hash = 0;
		for (int i=0; i<s.length(); i++){
			char c = s.charAt(i);
			long add = ((c-96)*exp(27, i))%MOD;
			hash += add;
			hash %= MOD;
		}
		return hash;
	}
	public static long exp(long base, int power){
		long ans = 1;
		if (power==0) ans = 1;
		else if (power%2==0){
			ans = exp(base, power/2);
			ans *= ans;
			ans %= MOD;
		} else {
			ans *= base;
			ans *=exp(base, power-1);
			ans %= MOD;
		}
		return ans;
	}
}
