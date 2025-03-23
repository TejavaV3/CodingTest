import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        String[] a = new String[n];
        for (int i=0; i<n; i++) {
            a[i] = s.substring(i);
        }
        Arrays.sort(a);
        for (int i=0; i<n; i++) {
            System.out.println(a[i]);
        }
    }
}