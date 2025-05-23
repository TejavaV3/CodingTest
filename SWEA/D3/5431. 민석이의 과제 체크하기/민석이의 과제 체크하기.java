
import java.util.Scanner;

class Solution {
	
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			boolean[] check = new boolean [n+1];
			
			for(int i=0; i<k; i++) {
				int input = sc.nextInt();
				check[input] = true;
			}
			System.out.print("#" + tc + " ");
			for(int i=1; i<=n; i++) {
				if(check[i] == false) {
					System.out.print(i+" ");
				}
			}
			System.out.println();
		}
	}
}