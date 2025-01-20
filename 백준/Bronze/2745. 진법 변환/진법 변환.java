import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		int b = sc.nextInt();
		int num = 0;	// 10진수로 변환한 수
		int exp = 0; // 지수
		
		long result = 0;
		
		
		
		for(int i=n.length()-1; i>=0; i--) {	//문자 끝에서부터 계산
			char m = n.charAt(i);
			
			if(m >= 'A' && m <= 'Z') {
				num = m - 55; //숫자로 변경 + 'A'=65에서 10 매핑을 위해 55 뺌
				
			}else { 
				num = m - '0'; // 매핑
			}
			result += num*Math.pow(b,exp++);	//math.pow 제곱함수
			
		}
		System.out.println(result);
		
		sc.close();
	}
}
