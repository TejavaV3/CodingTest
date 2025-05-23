import java.util.*;

class Solution {

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = 10;

		for (int tc = 1; tc <= T; tc++) {
			int num = sc.nextInt();
			char[][] arr = new char[8][8];
			for(int i=0; i<8; i++) {
				String str = sc.next();
				for(int j=0; j<8; j++) {
					arr[i][j] = str.charAt(j);
				}
			}
			int count = 0;
			
			//가로
			for(int i=0; i<8; i++) {
				for(int j=0; j<=8-num; j++) {
					boolean check = true;
					for(int k=0; k< num/2; k++) {
						if(arr[i][j+k]!=arr[i][j+num-1-k]) {
							check = false;
							break;
						}
					}
					if(check) {
						count++;
					}
				}
			}
			//세로
			for(int i=0; i<8; i++) {
				for(int j=0; j<=8-num; j++) {
					boolean check = true;
					for(int k=0; k< num/2; k++) {
						if(arr[j+k][i]!=arr[j+num-1-k][i]) {
							check = false;
							break;
						}
					}
					if(check) {
						count++;
					}
				}
			}
			
			System.out.println("#" + tc + " " + count);
		}
	}
}