
import java.util.Arrays;
import java.util.Scanner;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			int[][] arr = new int[9][9];
			boolean[] check = new boolean[10];
			boolean row = true;
			boolean column = true;
			boolean box = true;

			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			for (int i = 0; i < 9; i++) {
				Arrays.fill(check, false); // 배열 채우기
				for (int j = 0; j < 9; j++) {
					int p = arr[i][j];
					if (check[p]) {
						row = false;
						break;
					} else {
						check[p] = true;
					}
				}
				Arrays.fill(check, false);
				for (int j = 0; j < 9; j++) {
					int p = arr[j][i];
					if (check[p]) {
						column = false;
						break;
					} else {
						check[p] = true;
					}
				}
				Arrays.fill(check, false);
			}
			for (int i = 0; i < 9; i = i + 3) {

				for (int j = 0; j < 9; j = j + 3) {
					Arrays.fill(check, false);
					for (int c = 0; c < 3; c++) {
						for (int r = 0; r < 3; r++) {
							int p = arr[c + i][r + j];
							if (check[p]) {
								box = false;
								break;
							} else {
								check[p] = true;
							}
						}
					}
				}
			}

			int result = (row && column && box) ? 1 : 0;
			System.out.println("#" + test_case + " " + result);
		}
	}
}
