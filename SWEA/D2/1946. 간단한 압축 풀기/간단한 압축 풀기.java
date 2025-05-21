
import java.util.Scanner;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			StringBuilder sb = new StringBuilder(); //문자열 조작 시 효율적임
			int n = sc.nextInt();
			int count = 0;
			for (int i = 0; i < n; i++) {
				String ci = sc.next();
				int k = sc.nextInt();
				while(k-- > 0) {	// k가 0이 될때까지 k--
					sb.append(ci); 
					count++;
					if(count == 10) {
						sb.append("\n"); // 줄바꿈
						count = 0;
					}
				}
			}
			System.out.println("#" + test_case);
			System.out.println(sb.toString()); //string 형태로 바꾼 후 전체 출력
		}
	}
}