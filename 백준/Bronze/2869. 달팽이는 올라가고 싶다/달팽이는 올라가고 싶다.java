
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int up = Integer.parseInt(st.nextToken());
		int down = Integer.parseInt(st.nextToken());
		int length = Integer.parseInt(st.nextToken());
		//도착 전날을 기준으로 length-down값으로 계산
		int day = (length-down) / (up-down);
		
		//나머지가 있을 경우(잔여 블럭이 있을 경우)
		if((length-down)%(up-down) != 0) {
			day++;
		}
		System.out.println(day);
	}
}