
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			int n = sc.nextInt();
			int[][] arr = new int[n][n];

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					arr[i][j] = sc.nextInt();
				}
			}

			String[] rot90 = new String[n]; // 모든 값은 null
			String[] rot180 = new String[n];
			String[] rot270 = new String[n];

			for (int i = 0; i < n; i++) {
				// 문자열 초기화
				rot90[i] = "";
				rot180[i] = "";
				rot270[i] = "";

				for (int j = 0; j < n; j++) {
					rot90[i] += arr[n - j - 1][i];
					rot180[i] += arr[n - i - 1][n - j - 1];
					rot270[i] += arr[j][n - i - 1];
				}
			}
			System.out.println("#" + test_case);
			for (int i = 0; i < n; i++) {
				System.out.println(rot90[i] + " " + rot180[i] + " " + rot270[i]);
			}

		}
	}
}
