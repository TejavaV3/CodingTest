import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
		for (int k=0; k<n; k++){
			String line = br.readLine();
			String[] s = line.split(" ");
			String cmd = s[0];
			if (cmd.equals("push_front")){
				int num = Integer.parseInt(s[1]);
				deque.offerFirst(num);
			}else if (cmd.equals("push_back")){
				int num = Integer.parseInt(s[1]);
				deque.offerLast(num);
			}else if (cmd.equals("front")){
				if (deque.isEmpty()){
					bw.write("-1");
				}else {
					bw.write(String.valueOf(deque.peekFirst()));
				}
				bw.write("\n");
			}else if (cmd.equals("size")){
				bw.write(String.valueOf(deque.size()));
				bw.write("\n");
			}else if (cmd.equals("empty")){
				if (deque.isEmpty()){
					bw.write("1");
				}else{
					bw.write("0");
				}
				bw.write("\n");
			}else if (cmd.equals("pop_front")){
				if(deque.isEmpty()){
					bw.write("-1");
				}else {
					bw.write(String.valueOf(deque.pollFirst()));
				}
				bw.write("\n");
			}else if (cmd.equals("pop_back")){
				if(deque.isEmpty()){
					bw.write("-1");
				}else {
					bw.write(String.valueOf(deque.pollLast()));
				}
				bw.write("\n");
			}else if (cmd.equals("back")){
				if (deque.isEmpty()){
					bw.write("-1");
				}else {
					bw.write(String.valueOf(deque.peekLast()));
				}
				bw.write("\n");
			}
		}
		bw.flush();
	}
}