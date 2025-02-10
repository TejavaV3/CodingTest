import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = n;
		
		for(int i=0; i<n; i++) {
			String str = sc.next();
			
			int prev = 0;
			int[] check = new int[26];
			
			for(int j=0; j<str.length(); j++) {
				int now = str.charAt(j);
				
				if(prev != now) {
					if(check[now-97]==0) {
						check[now-97]++;
						prev = now;
						
					}else {
						count--;
						break;
					}
				}
			}
		}
		System.out.println(count);
	}
}