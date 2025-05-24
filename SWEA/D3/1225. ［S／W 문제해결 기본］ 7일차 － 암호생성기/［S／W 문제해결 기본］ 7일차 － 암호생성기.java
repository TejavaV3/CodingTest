import java.util.*;

class Solution {

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = 10;

		for (int tc = 1; tc <= T; tc++) {
			sc.nextInt();
			Queue<Integer> queue = new LinkedList<>();
			for(int i=0; i<8; i++) {
				queue.offer(sc.nextInt());
			}
			int minus = 1;
			while(true) {
				int num = queue.poll();
				num -= minus;
				
				if(num<=0) {
					queue.offer(0);
					break;
				}else {
					queue.offer(num);
				}
				minus++;
				
				if(minus>5) {
					minus = 1;
				}			
			}
			
			System.out.print("#" + tc + " ");
			while(!queue.isEmpty()) {
				System.out.print(queue.poll()+" ");
			}
			System.out.println();
		}
	}
}