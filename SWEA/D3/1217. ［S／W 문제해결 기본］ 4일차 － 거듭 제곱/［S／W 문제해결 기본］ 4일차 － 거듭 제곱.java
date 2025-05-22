
import java.util.Scanner;

class Solution {
	
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = 10;

		for (int test_case = 1; test_case <= T; test_case++) {
			int t = sc.nextInt(); // 무시
			int n =sc.nextInt();
			int m =sc.nextInt();
		
			int answer = recursion(n,m);
			
			System.out.println("#" + test_case + " " + answer);
		}
	}
	public static int recursion(int n, int m) {
		if(m>0) {		
			return n*recursion(n, m-1);
		}else {
			return 1;
		}
		
	}
}