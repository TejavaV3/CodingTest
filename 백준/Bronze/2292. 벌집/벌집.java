import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int n = 1;
		for(int i=0; i<a; i++) {
			if(a<=n+6*i) {
				System.out.println(i+1);
				break;
			}else {
				n=n+6*i;
			}
		}
		
	}
}
