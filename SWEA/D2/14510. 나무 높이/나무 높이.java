import java.util.*;

class Solution {

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int n = sc.nextInt();
			int[] tree = new int[n];
			int max = 0;

			for (int i = 0; i < n; i++) {
				tree[i] = sc.nextInt();
				max = Math.max(max, tree[i]);
			}

			int one = 0;
			int two = 0;

			for (int i = 0; i < n; i++) {
				int diff = max - tree[i];
				two += diff / 2; // 짝수날 몇번 필요한가
				one += diff % 2; // 홀수날 몇번 필요한가
			}
			// 짝수날이 너무 많으면 홀수 날을 늘리고 짝수 날을 줄인다(교차)
			if (two > one) {
				while (Math.abs(two - one) > 1) {
					two--;
					one += 2;
				}
			}
			int day = 0;
			if (one > two) { // 1이 많을 경우
				day = one * 2 - 1;
			} else if (two > one) { // 2가 많을 경우
				day = two * 2;
			} else { // 1,2가 같을 경우
				day = one + two;
			}
			System.out.println("#" + tc + " " + day);

		}
	}
}