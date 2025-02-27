import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a==b && b==c) {
			System.out.println(a+b+c); System.exit(0);
		}
		int min = Math.min(Math.min(a, b), c);
		int max = Math.max(Math.max(a, b), c);
		
		
		if(max<a+b+c-max) {
			System.out.println(a+b+c);
		}else {
			int s = a+b+c-max;
			s = s+s-1;
			System.out.println(s);
		}
	}
}