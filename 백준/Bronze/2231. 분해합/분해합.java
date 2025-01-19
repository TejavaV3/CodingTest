import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 자릿수의 길이를 알기 위해 문자열로 입력받음
		String str_n = sc.nextLine();	
		
		// 해당 문자열의 길이 변수
		int n_len = str_n.length();
		
		// 문자열을 정수로 변환
		int n = Integer.parseInt(str_n);
		int result = 0;
		
		// i는 가능한 최솟값인 n-9*n의 각 자릿수부터 시작
		for(int i=(n-(n_len*9)); i<n; i++) {
			int num = i;
			int sum = 0; // 각 자릿수 더하기
			
			while(num != 0) {
				sum += num % 10; // 각 자릿수 더하기
				num /= 10;				
			}
			
			// i값과 각 자릿수 누적합이 같을 경우 (생성자를 찾았을 경우)
			if(sum + i == n) {
				result = i;
				break;
			}
		}
		System.out.println(result);
	}
}
