
import java.util.Arrays;
import java.util.Scanner;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			int answer = 0;
			int[] arr = new int[10];
			for(int i=0; i<10; i++) {
				arr[i] = sc.nextInt();
			}
			Arrays.sort(arr);
			for(int i=1; i<9; i++) {
				answer += arr[i];
			}
			answer = Math.round((float)answer/8); //소수점 이하 절삭 주의
			System.out.println("#" + test_case + " " + answer);
		}
	}
}