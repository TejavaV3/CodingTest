import java.util.*;

class Solution {

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int n = sc.nextInt();
			int count = 0;
			for(int x = -n; x<=n; x++) {
				for(int y = -n; y<=n; y++) {
					if(x*x + y*y <= n*n) {
						count++;
					}
				}
			}
			System.out.println("#" + tc + " " + count);
		}
	}
}