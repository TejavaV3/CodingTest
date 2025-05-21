
import java.util.Arrays;
import java.util.Scanner;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			sc.nextInt(); // 테스트 케이스 번호(버림)

			int[] score = new int[101];
			for (int i = 0; i < 1000; i++) {
				int num = sc.nextInt();
				score[num]++;
			}
			
//			int[] clone = score.clone();
//			Arrays.sort(clone);
//			int h = clone[100];
//			int answer = 0;
//			
//			for (int i = 1; i <= 100; i++) {
//				if (score[i] == h) {
//					answer = i;
//				}
//			}
			
			int max = 0;
			int answer = 0;
			for(int i=0; i<=100; i++) {
				if(score[i] >= max) {
					max = score[i];
					answer = i;
				}
			}

			System.out.println("#" + test_case + " " + answer);
		}
	}
}