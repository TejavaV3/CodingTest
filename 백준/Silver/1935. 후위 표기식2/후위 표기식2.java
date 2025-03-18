import java.util.*;
public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String postfix = sc.next();
        double[] operand = new double[n];
        for(int i=0; i<n; i++){
            operand[i] = sc.nextDouble();
        }
        Stack<Double> s = new Stack<Double>();
        for(char ch : postfix.toCharArray()){
            if(ch >= 'A' && ch <= 'Z'){
                s.push(operand[(int)(ch-'A')]);
            }else{
                double op2 = s.pop();
                double op1 = s.pop();
                if(ch == '+'){
                    s.push(op1+op2);
                }else if(ch == '-'){
                    s.push(op1-op2);
                }else if(ch == '*'){
                    s.push(op1*op2);
                }else if(ch == '/'){
                    s.push(op1/op2);
                }
            }
        }
        System.out.printf("%.2f\n", s.pop());
	}
}
