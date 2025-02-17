import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 0;
		int k=2;
		for(int i=0; i<n; i++) {
			result = (k*2-1)*(k*2-1);
			k = k*2-1;
		}
		System.out.println(result);
	}
}
