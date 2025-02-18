import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine());
		
		int T = 1;
		int sum = 0;
		
		while(true) {
			// 직전 대각선 누적합 + 해당 대각선 개수를 이용한 범위 판별
			if(X <= sum + T) {
				if(T%2==1) { //대각선의 개수가 홀수라면
					// 분자가 큰 수부터 시작
					// 분자는 대각선 상 블럭의 개수 - (x번째 - 직선 대각선까지의 블럭 개수 -1)
					// 분모는 x번째 - 직전 대각선까지의 블럭 개수
					System.out.println((T-(X-sum-1))+"/"+(X-sum)); break;
				}else { //대각선의 개수가 짝수라면
					// 홀수일 떄의 출력을 반대로
					System.out.println((X-sum)+"/"+(T-(X-sum-1))); break;
				}
			}else {
				sum += T;
				T++;
			}
			
		}
		
	}
}
