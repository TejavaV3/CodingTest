import java.util.*;

class Solution {

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[] check = new int[n];
			int[] arr = new int[m];
			for (int j = 0; j < n; j++) {
				int count = 0;
				for (int i = 0; i < m; i++) {
					arr[i] = sc.nextInt();
					if (arr[i] == 1) {
						count++;
					}
				}
				check[j] = count;
			}

			Arrays.sort(check);
			int num = check[n - 1];
			int win = 0;

			for (int i = n - 1; i >= 0; i--) {
				if (check[i] == num) {
					win++;
				} else {
					break;
				}
			}
			System.out.println("#" + tc + " " + win + " " + num);

		}
	}
}