import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		int sum = 0;
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}

		for(int i=0; i<n-2; i++) {	
			for(int j=i+1; j<n-1; j++) {
				for(int z=j+1; z<n; z++) {
					int temp = arr[i] + arr[j] + arr[z];
					
					if(temp == m) {
						sum = temp; break;
					}
					if(sum < temp && temp < m) {
						sum = temp;
					}
				}
			}	
		}
		System.out.println(sum);
	}
}