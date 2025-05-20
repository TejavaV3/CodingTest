
import java.util.Scanner;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			int n = sc.nextInt();
			int[][] arr = new int[n][n];
			int m = sc.nextInt();

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			int answer = 0;

			// m == 1일때 : [i+0][j+0]
			// m == 2일때 : [i+0][j+0] + [i+0][j+1] + [i+1][j+0] + [i+1][j+1]
			// m == 3일때 : 위의 내용 + [i+0][j+2] + [i+1][j+2] + [i+2][j+0] + [i+2][j+1] +
			// [i+2][j+2]
			// m == 4일때 : 위의 내용 + [i+0][j+3] + [i+1][j+3]...[i+2][j+3]...[i+3][j+3]
			// 재..귀?

			for (int i = 0; i <= n - m; i++) { // 부등호 신경쓰기
				for (int j = 0; j <= n - m; j++) {
					// 파리채 넓이 구하기
					int sum = 0;
					for (int x = i; x < i + m; x++) {
						for (int y = j; y < j + m; y++) {
							sum += arr[x][y];
						}
					}
					if (answer < sum) {
						answer = sum;
					}
				}
			}

			System.out.println("#" + test_case + " " + answer);
		}
	}

}
