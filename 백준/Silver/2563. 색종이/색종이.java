import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [][] floor = new int [100][100];
		int p = sc.nextInt();
		int count = 0;
		for(int i=0; i<p; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			for(int j=a; j<a+10; j++){
				for(int k=b; k<b+10; k++){
					if(floor[j][k] == 1){
						floor[j][k]++;
					}
					floor[j][k] = 1;
				}
			}
		}
		for(int i=0; i<100; i++){
			for(int j=0; j<100; j++){
				if(floor[i][j] == 0){
				}else if(floor[i][j] == 1){
					count++;
				}

			}
		}
		System.out.println(count);
	}
}