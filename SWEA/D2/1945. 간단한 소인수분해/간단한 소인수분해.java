import java.util.Scanner;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			int n = sc.nextInt();
			int[] pf = { 2, 3, 5, 7, 11 };
			int[] count = new int[5];
			for (int i = 0; i < count.length; i++) {
				while (n % pf[i] == 0) {
					count[i]++;
					n = n / pf[i];
				}
			}
			System.out.print("#" + test_case);
			for (int c : count) {
				System.out.print(" " + c);
			}
			System.out.println();
		}
	}
}