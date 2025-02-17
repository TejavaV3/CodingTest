import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int min = Integer.MAX_VALUE; //가장 작은 이동 거리/ Max_value : 데이터타입 중 가장 큰 값
		int answer =0; //가장 빨리 도착하는 반의 번호
		
		for(int i=1; i<=k; i++) { //1반~k반까지 반복
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());  //반의 출발 위치 A
			int b = Integer.parseInt(st.nextToken()); //반의 출발 위치 B
			int d = a-1+m-b; //최단거리 계산
			
			if(d<min) {//d가 min보다 작을 때 실행
				min = d; // 최단 거리 값 갱신
				answer = i; // 반 갱신
			}
		}
		bw.write(answer+"");
		bw.flush();
	}
}