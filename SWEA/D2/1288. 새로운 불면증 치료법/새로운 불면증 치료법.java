import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			int n = sc.nextInt();
			Set<Character> set = new HashSet<>();
			int count = 1;
			while (set.size() < 10) {
				String str = Integer.toString(n * count);
				for (int i = 0; i < str.length(); i++) {
					set.add(str.charAt(i));
				}
				count++;
			}

			System.out.println("#" + test_case + " " +(count-1)*n);

		}
	}
}