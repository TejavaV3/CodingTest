import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Queue<Integer> myQueue = new LinkedList<>();
        int N = sc.nextInt();
        for(int i=1; i<=N; i++){
            myQueue.add(i);
        }
        while(myQueue.size()>1){
            myQueue.poll();
            myQueue.add(myQueue.poll());
        }
        System.out.println(myQueue.poll());
    }
}