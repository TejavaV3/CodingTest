import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t=1 ; t<=T; t++) {
			int n = sc.nextInt();
			
			int result = n*n;
			System.out.println("#" + t + " " + result);
		}
	}
}
