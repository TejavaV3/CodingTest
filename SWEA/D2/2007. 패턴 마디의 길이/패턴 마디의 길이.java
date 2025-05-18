
import java.util.Scanner;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			String str = sc.next();
			int answer = 0;
			for (int i = 1; i <= 10; i++) {
				String pattern = str.substring(0, i);
				if (pattern.equals(str.substring(i, i + i))) {
					answer = i;
					break;
				}
			}
			System.out.println("#" + test_case + " " + answer);
		}
	}
}