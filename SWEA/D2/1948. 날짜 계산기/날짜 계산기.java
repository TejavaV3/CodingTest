
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			Map<Integer, Integer> map = new HashMap<>();
			map.put(1, 31);
			map.put(2, 28);
			map.put(3, 31);
			map.put(4, 30);
			map.put(5, 31);
			map.put(6, 30);
			map.put(7, 31);
			map.put(8, 31);
			map.put(9, 30);
			map.put(10, 31);
			map.put(11, 30);
			map.put(12, 31);

			int answer = 0;
			int m1 = sc.nextInt();
			int d1 = sc.nextInt();
			int m2 = sc.nextInt();
			int d2 = sc.nextInt();

			if (m1 == m2) {
				answer = d2 - d1 + 1;
			} else {
				answer = map.get(m1) - d1 + 1; // 시작일 포함 +1
				for (int i = m1 + 1; i <= m2; i++) {
					if (i == m2) {
						answer += d2;
					} else {
						answer += map.get(i);
					}
				}
			}

			System.out.println("#" + test_case + " " + answer);
		}
	}
}