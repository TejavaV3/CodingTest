import java.util.*;

class Solution {

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[] sum = new int[n+m+1];
			for(int i=1; i<=n; i++) {
				for(int j=1; j<=m; j++) {
					sum[i+j]++;
				}
			}
			int max = 0;
			for(int i=2; i< sum.length; i++) {
				if(max<sum[i]) {
					max = sum[i];
				}
			}
			System.out.print("#" + tc + " ");
			for(int i=0; i<sum.length; i++) {
				if(sum[i]==max) {
					System.out.print(i +" ");
				}
			}
			System.out.println();
			
		}
	}
}