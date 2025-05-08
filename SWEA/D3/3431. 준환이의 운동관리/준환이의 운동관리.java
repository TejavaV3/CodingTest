import java.util.Scanner;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			int answer = 0;
			int l = sc.nextInt();
			int u = sc.nextInt();
			int x = sc.nextInt();
			if (l <= x && x <= 400) {
				answer = 0;
			}else if(x < l){
				answer = l-x;
			}else if(x > u) {
				answer = -1;
			}
			
			System.out.println("#" + t + " " + answer);
		}
	}
}
