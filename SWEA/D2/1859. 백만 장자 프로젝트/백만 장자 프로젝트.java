
import java.util.Arrays;
import java.util.Scanner;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			long total = 0;
			int max = 0;
			for(int i=n-1; i>=0; i--) {
				if(arr[i] > max) {
					max = arr[i]; // 미래 가격 중 가장 큰 값
				}else {
					total += max - arr[i]; //크게 팔 날의 값 - 해당 날에 산 값 = 순이익
				}
			}

			System.out.println("#" + test_case + " " + total);
		}
	}
}