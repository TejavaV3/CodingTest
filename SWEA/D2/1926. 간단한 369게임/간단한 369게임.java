
import java.util.Scanner;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		
		
		for(int i=1; i<=n; i++) {
			String str = Integer.toString(i);
			int count = 0;
			for(int j=0; j<str.length(); j++) {
				char c = str.charAt(j);
				if(c == '3' || c == '6' || c=='9') {
					count++;
				}
			}
			if(count>0) {
				for(int j=0; j<count; j++) {
					System.out.print("-");
				}
			}else {
				System.out.print(str);
			}
			System.out.print(" ");
		}
	}
}
