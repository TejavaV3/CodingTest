
import java.util.Arrays;
import java.util.Scanner;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			int up = 0;
			int down = 0;
			int n = sc.nextInt();
			int[] height = new int[n];

			for (int i = 0; i < n; i++) {
				height[i] = sc.nextInt();
			}

			for (int i = 1; i < n; i++) {
				if (height[i] > height[i-1]) {
					up = Math.max(up, height[i] - height[i-1]);
					
				} else if (height[i - 1] > height[i]) {
					down = Math.max(down, height[i - 1] - height[i]);
				}
			}
			System.out.println("#" + test_case + " " + up + " " + down);
		}
	}
}
