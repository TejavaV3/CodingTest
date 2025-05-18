import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {

			int P = sc.nextInt();
			int Q = sc.nextInt();
			int R = sc.nextInt();
			int S = sc.nextInt();
			int W = sc.nextInt();
			int answer = 0;

			if (W <= R) {
				if (W * P <= Q) {
					answer = W * P;
				} else {
					answer = Q;
				}
			} else {
				if (W * P <= Q + ((W - R) * S)) {
					answer = W * P;
				} else {
					answer = Q + ((W - R) * S);
				}
			}

			System.out.println("#" + test_case + " " + answer);

		}
	}
}