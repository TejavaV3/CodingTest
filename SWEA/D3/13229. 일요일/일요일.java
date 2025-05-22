
import java.util.Scanner;

class Solution {

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			String str = sc.next();
			String[] arr = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };
			int answer = 1;
			for (int i = 0; i < 7; i++) {
				if (str.equals(arr[i])) {
					answer = 7 - i;
				}
			}

			System.out.println("#" + test_case + " " + answer);
		}
	}
}