
import java.util.Arrays;
import java.util.Scanner;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			int avg = 0;
			int count = 0;

			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
				avg += arr[i];
			}
			avg = avg / n; // 평균값 내림
			for (int i = 0; i < n; i++) {
				if (arr[i] <= avg) {
					count++;
				}
			}
			System.out.println("#" + test_case + " " + count);
		}
	}
}
