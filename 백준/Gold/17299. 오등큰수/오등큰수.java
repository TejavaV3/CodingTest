import java.io.*;
import java.util.*;

public class Main {
   
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        int[] ans = new int[n];
        int[] freq = new int[1000001];
        String[] temp = br.readLine().split(" ");
        Stack<Integer> s = new Stack<>();

        for (int i=0; i<n; i++){
            a[i] = Integer.parseInt(temp[i]);
            freq[a[i]] += 1;
        }
        s.push(0);
        for (int i=1; i<n; i++){
            if (s.isEmpty()){
                s.push(i);
            }
            while (!s.isEmpty() && freq[a[s.peek()]] < freq[a[i]]){
                ans[s.pop()] = a[i];
            }
            s.push(i);
        }
        while (!s.isEmpty()){
            ans[s.pop()] = -1;
        }
        for (int i=0; i<n; i++){
            bw.write(ans[i] + " ");
        }
        bw.write("\n");
        bw.flush();
        
	}

}
