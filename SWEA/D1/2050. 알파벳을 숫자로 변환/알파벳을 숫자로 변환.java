
import java.util.Scanner;

class Solution {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String sentence = sc.next();
		for(int i=0; i<sentence.length(); i++) {
			int a = sentence.charAt(i)-'A'+1;
			System.out.print(a + " ");
		}
		
	}
}