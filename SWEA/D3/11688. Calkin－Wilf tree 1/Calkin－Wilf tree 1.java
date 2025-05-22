
import java.util.Arrays;
import java.util.Scanner;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			int a = 1;
			int b = 1;
			String str = sc.next();
			
			for(int i=0; i<str.length(); i++) {
				if(str.charAt(i)=='L') {
					b = a+b;
				}else if(str.charAt(i)=='R') {
					a = a+b;
				}
			}
			
			System.out.println("#" + test_case + " " + a + " " + b);
		}
	}
}