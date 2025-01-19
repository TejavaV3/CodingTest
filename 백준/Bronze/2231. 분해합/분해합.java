import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 0;
		
		for(int i=0; i<n; i++) {
			int m = i;	
			int sum = 0;
			
			while(m!=0) {	
				sum+= m % 10;	
				m /= 10;	
			}
			
			if(sum + i == n) {
				result = i;
				break;
			}
		}
		System.out.println(result);
	}
}
