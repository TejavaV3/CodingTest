
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			int n = sc.nextInt();
			int speed = 0;
			int distance = 0;

			for (int i = 0; i < n; i++) {
				int cmd = sc.nextInt();
				if (cmd == 0) { // 그대로
				} else if (cmd == 1) { // 가속
					speed += sc.nextInt();
				} else if (cmd == 2) { // 감속
					speed -= sc.nextInt();
					if(speed < 0) {
						speed = 0;
					}
				}
				distance += speed;
			}
			System.out.println("#" + test_case + " " + distance);
		}
	}
}
