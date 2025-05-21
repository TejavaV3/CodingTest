
import java.util.Scanner;
import java.util.stream.IntStream;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			int n = sc.nextInt();
			String right = sc.next();
			String wrong = sc.next();
			int count = 0;
			for (int i = 0; i < n; i++) {
				if (right.charAt(i) == wrong.charAt(i)) {
					count++;
				}
			}
			System.out.println("#" + test_case + " " + count);
		}
	}
}
