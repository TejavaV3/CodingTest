
import java.util.Arrays;
import java.util.Scanner;

class Solution {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		for(int i=0; i<n; i++) {
			array[i] = sc.nextInt();
		}
		
		Arrays.sort(array);
		System.out.print(array[n/2]);
		
	}
}