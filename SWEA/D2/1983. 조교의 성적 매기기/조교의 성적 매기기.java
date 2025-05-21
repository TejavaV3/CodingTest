import java.util.Arrays;
import java.util.Scanner;
import java.io.FileInputStream;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int a, b, c;
			double[] scores = new double[n];
			
			//오름차순 정렬이므로 거꾸로 적기
			String[] credit = { "D0", "C-", "C0", "C+", "B-", "B0", "B+", "A-", "A0", "A+" };

			for (int i = 0; i < n; i++) {
				a = sc.nextInt();
				b = sc.nextInt();
				c = sc.nextInt();
				scores[i] = 0.35 * a + 0.45 * b + 0.2 * c;
			}

			String rank = "";
			double goal = scores[k - 1]; //0부터 시작하므로 k-1번째
			Arrays.sort(scores); // 오름차순

			for (int i = 0; i < n; i++) {
				if (goal == scores[i]) {
					rank = credit[i / (n / 10)];
				}
			}
			System.out.println("#" + test_case + " " + rank);
		}
	}
}