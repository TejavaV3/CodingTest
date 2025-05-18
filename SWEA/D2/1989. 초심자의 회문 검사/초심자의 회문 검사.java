import java.lang.StringBuilder;
import java.util.Scanner;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {

			String str = sc.next();
			String restr = new StringBuilder(str).reverse().toString();
			int answer = 0;
			if (str.equals(restr)) {
				answer = 1;
			}

			System.out.println("#" + test_case + " " + answer);

		}
	}
}