import java.util.*;

class Solution {

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = 10;

		for (int tc = 1; tc <= T; tc++) {
			int n = sc.nextInt();
			int[][] str = new int [n][n];
			for(int i=0; i<100; i++) {
				for(int j=0; j<100; j++) {
					str[i][j] = sc.nextInt();
				}
			}
			
			int count = 0;
			
			for(int i=0; i<100; i++) {
				boolean check = false;
				
				for(int j=0; j<100; j++) {
					
					if(str[j][i]==1) {
						check = true;
						
					}else if(str[j][i]==2) {
						if(check) {
							count++;
							check=false;
						}
					}
				}
			}
			System.out.println("#" + tc + " " + count);

		}
	}
}