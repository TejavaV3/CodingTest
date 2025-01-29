import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static boolean visited[];
	static ArrayList<Integer>[] A;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br 
			= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		visited = new boolean[n+1]; // 1부터 시작
		A = new ArrayList[n+1];
		
		for(int i=1; i<n+1; i++) {
			A[i] = new ArrayList<Integer>();	
		}
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken()); 
			A[s].add(e);
			A[e].add(s);
		}
		int count = 0;
		for(int i=1; i<n+1; i++) {
			if(!visited[i]) {	// 방문하지 않은 노드이면
				count++;
				DFS(i);
			}
		}
		System.out.println(count);
	}

	private static void DFS(int v) {
		if(visited[v]) {	//방문한 노드이면
			return;
		}
		visited[v] = true;
		for(int i : A[v]) {	//A[v] 객체를 꺼내서 i에 대입하겠다
			if(!visited[i]) {
				DFS(i);	//재귀함수
			}
		}
	}
}