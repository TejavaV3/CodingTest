import java.util.*;
import java.io.*;

public class Main {
    static void print(BufferedWriter bw, Stack<Character> s) throws IOException{
        while (!s.isEmpty()){   //스택에 값이 없을 때까지
            bw.write(s.pop());  //스택에서 제거한 것을 출력 
        }
    }
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        boolean tag = false;
        Stack<Character> s = new Stack<>();
        
        for (char ch : str.toCharArray()){   //string 문자열을 char형 배열로 바꿔서 반환
            if (ch == '<'){ //'<,>' 문자는 그냥 출력
                print(bw, s);
                tag = true;
                bw.write(ch);
            }else if (ch == '>'){  
                tag = false;
                bw.write(ch);
            }else if (tag){ // tag가 true이면 그냥 출력
                bw.write(ch);
            }else { // tag가 false이면 거꾸로 출력
                if (ch == ' '){ //공백이면
                    print(bw, s);
                    bw.write(ch);
                } else {
                    s.push(ch);
                }
            }
        }
        print(bw, s);
        bw.write("\n");
        bw.flush();
	}

}
