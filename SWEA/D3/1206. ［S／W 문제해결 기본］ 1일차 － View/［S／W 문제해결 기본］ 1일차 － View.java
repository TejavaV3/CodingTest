
import java.util.Scanner;

class Solution {
	
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = 10;

		for (int tc = 1; tc <= T; tc++) {
			int n = sc.nextInt();
			int[] arr= new int [n];
			for(int i=0; i<n; i++) {
				arr[i] = sc.nextInt();
			}
			int result = 0;
			for(int i=2; i<n-2; i++) {
				int max = Math.max(
							Math.max(arr[i+1],arr[i+2]),
							Math.max(arr[i-1],arr[i-2])
						);
				if(arr[i]>max) {
					result += arr[i]-max;
				}	
			}
			System.out.println("#"+tc+" "+result);
		}
	}
}