
import java.util.Scanner;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			int count = 0;
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			for (int x = 1; x * x <= b; x++) {
				String strx = Integer.toString(x);
				boolean check = true; // 여기에 초기화 ,처음부터 true로 가정
				for(int i=0; i<strx.length()/2 ; i++) {
					if(strx.charAt(i) != strx.charAt(strx.length() - i - 1)) {
						check = false;
						break;
					}
				}
				
				if(check) {
					if (x * x >= a) {
						int temp = x * x;
						String str = Integer.toString(temp);
						
	
						for (int i = 0; i < str.length() / 2; i++) { // 반만 비교해도 충분
							if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
								check = false;
								break;
							}
						}
	
						if (check) {
							count++;
						}
	
					}
				}
			}

			System.out.println("#" + test_case + " " + count);
		}
	}
}