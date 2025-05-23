
import java.util.Scanner;

class Solution {

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = 10;

		for (int tc = 1; tc <= T; tc++) {
			int count = sc.nextInt();
			int[] arr = new int[100];
			for (int i = 0; i < 100; i++) {
				arr[i] = sc.nextInt();
			}
			int high = 0;
			int low = 0;
			for (int i = 0; i < count; i++) {
				high = 0; low = 0;
				for (int j = 1; j < 100; j++) {
					if (arr[j] > arr[high]) {
						high = j;
					}
					if (arr[j] < arr[low]) {
						low = j;
					}
				}
				if (arr[high] - arr[low] <= 1) {
					break;
				}
				arr[high]--;
				arr[low]++;
			}
			
			for (int j = 1; j < 100; j++) {
				if (arr[j] > arr[high]) {
					high = j;
				}
				if (arr[j] < arr[low]) {
					low = j;
				}
			}
			int answer = arr[high] - arr[low];
			System.out.println("#" + tc + " " + answer);
		}
	}
}