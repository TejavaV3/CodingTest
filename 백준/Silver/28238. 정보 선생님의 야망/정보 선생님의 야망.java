
import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean[][] a = new boolean[n][5];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<5; j++) {
				a[i][j] = sc.nextInt() == 1; //가져온 값이 1이면 true, 0이면 false로 저장
			}
		}
		int maxCount = -1; //가장 많이 겹치는 학생 수
		int bestA = -1, bestB = -1; //최적의 특성 인덱스
		
		//탐색
		for(int i=0; i<5; i++) {
			for(int j=i+1; j<5; j++) {
				int count = 0; //(i,j) 조합을 가진 학생수 저장
				for(int k=0; k<n; k++) { // 모든 학생 확인
					if(a[k][i] && a[k][j]) { //i와 j가 모두 true인 경우 count 증가
						count++;
					}
				}
				//최대 겹치는 학생 수 갱신
				if(count>maxCount) {
					maxCount = count;
					bestA = i;
					bestB = j;
				}
			}
		}
		//출력
		System.out.println(maxCount);
		for(int i=0; i<5; i++) {
			if(i==bestA || i == bestB) {
				System.out.println("1 ");
			}else {
				System.out.println("0 ");
			}
		}
	}
}