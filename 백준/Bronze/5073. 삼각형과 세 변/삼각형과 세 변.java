import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			if(a==0 && b==0 && c==0) {
				break;
			}
			int m = Math.max(Math.max(a, b),c);
			if((a+b+c-m)<=m) {
				System.out.println("Invalid"); 
			}else {
				if(a==b && b==c) {
					System.out.println("Equilateral");
				}else if(a==b || a==c || b==c){
					
					System.out.println("Isosceles");
				}else if(a!=b && a!=c) {
					System.out.println("Scalene");
				}
			}
		}
		
	}
}