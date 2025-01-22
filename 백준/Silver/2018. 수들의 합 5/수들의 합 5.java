import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		int count = 1;
		int sum = 1;
		int start_index = 1;
		int end_index = 1;
		
		while(end_index != n) {
			if(sum>n) {
				sum = sum - start_index;
				start_index++;
			}else if(sum<n) {
				end_index++;
				sum = sum + end_index;
			}else if(sum==n) {
				end_index++;
				sum = sum + end_index;
				count++;
			}
		}
		System.out.println(count);

	}
}