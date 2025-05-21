
import java.util.Scanner;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			int h1 = sc.nextInt();
			int m1 = sc.nextInt();
			int h2 = sc.nextInt();
			int m2 = sc.nextInt();
			m1 += m2;
			h1 += h2;

			if (m1 >= 60) {
				m1 = m1 - 60;
				h1++;
			}
			if (h1 > 12) {
				h1 -= 12;
			}

			System.out.println("#" + test_case + " " + h1 + " " + m1);
		}
	}
}
