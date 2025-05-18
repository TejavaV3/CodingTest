import java.io.*;
import java.util.Base64;

class Solution {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T;
		T = Integer.parseInt(br.readLine());

		for (int test_case = 1; test_case <= T; test_case++) {
			String str = br.readLine();
			String answer = new String(Base64.getDecoder().decode(str));
			
			System.out.println("#" + test_case + " " + answer);
		}
	}
}