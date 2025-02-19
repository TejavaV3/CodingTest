import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = 0;
		int y = 0;
		int xInput = 0;
		int yInput = 0;
		
		for(int i=0; i<3; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			xInput = Integer.parseInt(st.nextToken());
			yInput = Integer.parseInt(st.nextToken());
			//XOR 연산(중복제거)
			x ^= xInput;
			y ^= yInput;
		}
		
		System.out.println(x+" "+y);
	}
}
