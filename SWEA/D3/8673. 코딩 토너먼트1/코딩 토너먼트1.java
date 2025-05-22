import java.util.Scanner;

class Solution {
	
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			int k = sc.nextInt();
			int n = (int)Math.pow(2, k); // 1<<k로도 표현 가능
			int[] arr = new int[n];
			for(int i =0; i<n; i++) {
				arr[i] = sc.nextInt();
			}
			int answer = playMatch(arr); 
			
			System.out.println("#" + test_case + " " + answer);
		}
	}
	public static int playMatch(int[] arr) {
		// 1명 남았을 때
		if(arr.length == 1) {
			return 0;
		}
		int[] next = new int[arr.length/2];
		int total = 0;
		for(int i=0; i<arr.length; i+=2) {
			int a = arr[i];
			int b = arr[i+1];
			// 점수 차 누적
			total += Math.abs(a-b);
			// 큰  수 내보내기
			next[i/2] = Math.max(a, b);
		}
		// 이후 다음 라운드
		return total + playMatch(next);
	}
}