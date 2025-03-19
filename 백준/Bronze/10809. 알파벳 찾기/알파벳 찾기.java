import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int arr[] = new int[s.length()];
		for (int i = 0; i < s.length(); i++) {
			arr[i] = s.charAt(i);
		}
		
		int r = 0;
		
		for(int i = 'a'; i<'z'+1; i++) {
			for(int j=0; j<arr.length; j++)
				if(i==arr[j]) {
					r = j ; break;
				}else {
					r = -1;
			}
			System.out.print(r + " ");
		}
	}
}