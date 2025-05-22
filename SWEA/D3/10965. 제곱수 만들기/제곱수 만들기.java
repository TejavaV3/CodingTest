import java.util.*;

class Solution {

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int a = sc.nextInt();
			int result = 1;
			for (int i = 2; i <= Math.sqrt(a); i++) { //Math.sqrt() : 제곱근
				int cnt = 0;
				while (a % i == 0) {
					a /= i;
					cnt++;
				}
				if (cnt % 2 != 0) {
					result *= i;
				}
			}
			if (a != 1) {
				result *= a;
			}
			System.out.println("#" + tc + " " + result);
		}
	}
}