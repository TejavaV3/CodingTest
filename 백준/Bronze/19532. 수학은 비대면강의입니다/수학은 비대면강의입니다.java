import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int f = sc.nextInt();
		int x = 0; int y = 0;
		
		for(int i=-1000; i<1000; i++) {
			for(int j=-1000; j<1000; j++) {
				if((a*i)+(b*j) == c) {
					if((d*i)+(e*j) == f) {
						x = i;
						y = j;
						System.out.println(x);
						System.out.println(y);
						
					}
					
				}
				
				
			}
		}
	}
}
