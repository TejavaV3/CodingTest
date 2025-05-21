
import java.util.Scanner;
import java.io.FileInputStream;

class Solution {
	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			// 배수 관계면 그리디 알고리즘이 유용함
			int num = sc.nextInt();
			int[] answer = new int[8];
			int[] result = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };
			int count = 0;
			for (int i = 0; i < 8; i++) {
				count = num / result[i];
				answer[i] = count;
				num -= result[i] * count;
			}
			System.out.println("#" + test_case);
			for (int i = 0; i < 8; i++) {
				System.out.print(answer[i] + " ");
			}
			System.out.println();
		}
	}
}