import java.util.Scanner;
import java.io.FileInputStream;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			int[] array = new int [10];
			for(int i=0; i<array.length; i++) {
				 array[i] = sc.nextInt();
			}
			double answer = 0;
			for(int i=0; i<array.length; i++) {
				answer += array[i];
			}
			answer = answer/array.length;
			long result = Math.round(answer);
			
			System.out.println("#" + test_case + " " + result);
		}
	}
}