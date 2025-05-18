
import java.util.ArrayList;
import java.util.Scanner;


class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			ArrayList<Integer> A = new ArrayList<>();
			ArrayList<Integer> B = new ArrayList<>();
			
			for(int i=0; i<n; i++) {
				A.add(sc.nextInt());
			}
			for(int j=0; j<m; j++) {
				B.add(sc.nextInt());
			}
			int answer = 0;
			if(n < m) {
				for(int i=0; i<=m-n; i++) {
					int sum = 0;
					for(int j=0; j<n; j++) {
						sum += A.get(j) * B.get(i+j);
					}
					if(answer < sum) {
						answer = sum;
					}
				}
			}else {
				for(int i=0; i<=n-m; i++) {
					int sum = 0;
					for(int j=0; j<m; j++) {
						sum += A.get(i+j) * B.get(j);
					}
					if(answer < sum) {
						answer = sum;
					}
				}
			}
			
			System.out.println("#" + test_case + " " + answer);

		}
	}
}