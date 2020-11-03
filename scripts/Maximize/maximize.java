import java.util.*;

public class maximize {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		
		ArrayList<Long> nums = new ArrayList<>();
		for (int i = 0; i < q; i++){
			int type = sc.nextInt();
			if (type == 1)  {
				long newVal = sc.nextInt();
				if (nums.size() == 0) {
          nums.add(newVal);
        } else {
					int low = 0;
					int high = nums.size() - 1;
					int mid = 0;
					while (low <= high) {
						mid = (low + high) / 2;
						if (nums.get(mid) > newVal) {
              high = mid - 1;
            } else if (nums.get(mid) < newVal) {
              low = mid + 1;
            } else {
              break;
            }
					}

					if (nums.get(mid) < newVal) {
            nums.add(mid + 1, newVal);
          } else {
            nums.add(mid, newVal);
          }
				}
			} else {
				
				long max = nums.get(nums.size() - 1);
				long sum = max;
				 
				double j = 0;
				double best = 0;
				while (j < nums.size() - 1 && max - (sum + nums.get((int) j)) / (j +2) > best ) {
					sum += nums.get((int) j);
					best = max - sum / (j + 2);
					j++;
				} 
				System.out.println(best);
			}
		}
	}
}
