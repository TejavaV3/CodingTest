
import java.util.Scanner;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			int count = 0;
			int[] a = new int[10];
			String str = sc.next();
			for (int i = 0; i < str.length(); i++) {
				int input = str.charAt(i)-'0';
				a[input]++;
			}
			for (int i = 0; i < 10; i++) {
				if (a[i] != 0) {
					count++;
				}
			}
			System.out.println("#" + test_case + " " + count);
		}
	}
}