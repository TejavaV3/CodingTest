
import java.util.Arrays;
import java.util.Scanner;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			String str = sc.next();
			String newstr = "";
			for(int i=0; i<str.length(); i++) {
				switch(str.charAt(i)) {
				case 'a' : break;
				case 'e' : break;
				case 'i' : break;
				case 'o' : break;
				case 'u' : break;
					default : newstr += str.charAt(i);
				}
			}
			System.out.println("#" + test_case + " " + newstr);
		}
	}
}
