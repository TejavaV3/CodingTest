import java.io.*;
import java.util.Arrays;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		mData[] A = new mData[N];
		for(int i=0; i<N; i++) {
			A[i] = new mData(Integer.parseInt(br.readLine()), i);
		}
		Arrays.sort(A); // A 배열 정렬 시간복잡도 : O(nlogn)		
		int Max = 0;
		for (int i=0; i<N; i++) {
			if(Max < A[i].index-i)	// 정렬 전 index - 정렬 후 index 계산의 최댓값 저장하기
				Max = A[i].index - i;
		}
		System.out.println(Max + 1);
	}
}
class mData implements Comparable<mData>{
	int value;
	int index;
	
	public mData(int value, int index) {
		super();
		this.value = value;
		this.index = index;
	}

	@Override
	public int compareTo(mData o) {	// value 기준 오름차순 정렬하기
		return this.value - o.value;
	}
	
}

