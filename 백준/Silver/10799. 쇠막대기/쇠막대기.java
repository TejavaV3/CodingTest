import java.util.*;


public class Main {
   
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine().trim(); //문자열 입력받기
        Stack<Integer> s = new Stack<Integer>();
        int ans = 0;

        for (int i=0; i<a.length(); i++){
            char c = a.charAt(i);
            if (c == '('){  //문자가 '('일때
                s.push(i);
            }else { //문자가 ')'일때
                if (s.peek()+1 == i){ //만약 stack의 가장 위에 있는 부분+1이 i와 같을 때<- 레이저 
                    s.pop();
                    ans += s.size(); //s의 사이즈 +1 (쪼개진 조각 갯수)
                }else { //레이저 아닐 때
                    s.pop();
                    ans += 1; // +1
                }
            }
        }
        System.out.println(ans);
	}

}
