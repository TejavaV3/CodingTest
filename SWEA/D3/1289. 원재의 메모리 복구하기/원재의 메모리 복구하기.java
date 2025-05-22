
import java.util.Scanner;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			int count = 0;
			String str = sc.next();

			// 방법 1 - 배열 사용
//			int[] memory = new int [str.length()];
//			for(int i=0; i<str.length(); i++) {
//				int input = str.charAt(i)-'0'; // 유니코드 값 변경
//				if(memory[i] != input) {
//					int j = i;
//					while(j<str.length()) {
//						memory[j] = input;
//						j++;
//					}
//					count++;
//				}
//			}

			// 방법 2
			char prev = '0';
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) != prev) {
					count++;
					prev = str.charAt(i);
				}
			}
			System.out.println("#" + test_case + " " + count);
		}
	}
}