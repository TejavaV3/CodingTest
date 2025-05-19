
import java.util.Scanner;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			int n = sc.nextInt();
			int[][] arr = new int[n][n];
			int[] dx = {0, 1, 0, -1}; // 오른쪽, 아래, 왼쪽, 위 (시계방향)
			int[] dy = {1, 0, -1, 0};
			int dir = 0;
			int x = 0, y = 0;
			
			for(int i=1; i<= n*n; i++) { // 총 입력 횟수
				arr[x][y] = i;
				int nx = x + dx[dir];
				int ny = y + dy[dir];
				if(nx < 0 || ny < 0 || nx >= n || ny >= n || arr[nx][ny] != 0) { 
					dir = (dir+1)%4; //방향 전환
					nx = x + dx[dir];
					ny = y + dy[dir];
				}
				x = nx;
				y = ny;
			}
			System.out.println("#" + test_case);
			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++) {
					System.out.print(arr[i][j] +" ");
				}
				System.out.println();
			}
		}
	}
	
}
