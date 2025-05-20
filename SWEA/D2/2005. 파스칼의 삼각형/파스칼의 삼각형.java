
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
				for (int j = 0; j <= i; j++) { // 1. 반복 범위 j <= i
					if (j == 0 || i == j) { // 2. i==j-1 수정
						arr[i][j] = 1;
					}
					if (i != 0 && j != 0) {
						arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
					}
				}
			}
			System.out.println("#" + test_case);
			for (int i = 0; i < n; i++) {
				for (int j = 0; j <= i; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
		}
	}

}
