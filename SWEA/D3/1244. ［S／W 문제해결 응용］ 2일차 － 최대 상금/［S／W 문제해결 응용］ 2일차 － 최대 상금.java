
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

class Solution {

	static HashSet<String> visited; // 방문 상태 저장

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			String str = sc.next();
			int count = sc.nextInt();
			int[] arr = new int[str.length()];
			for (int i = 0; i < str.length(); i++) {
				arr[i] = str.charAt(i) - '0';
			}
			visited = new HashSet<>();
			int answer = dfs(arr, count);

			System.out.println("#" + tc + " " + answer);
		}
	}

	public static int dfs(int[] arr, int count) {
		String state = arrToString(arr) + count; // 현재 상태 문자열로 변환

		if (visited.contains(state)) {
			return 0; // 이미 방문한 상태면 탐색하지 않음

		}
		visited.add(state);
		
		if (count == 0) {
			return arrToNum(arr);
		}
		int max = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				swap(arr, i, j);
				max = Math.max(max, dfs(arr, count - 1));
				swap(arr, i, j); // 원상복구
			}
		}
		return max;
	}

	public static int arrToNum(int[] arr) { //배열을 숫자로
		int num = 0;
		for (int i : arr) {
			num = num * 10 + i;
		}
		return num;
	}
	
	public static String arrToString(int[] arr) { //배열을 문자열로 (방문 체크용)
		StringBuilder sb = new StringBuilder();
		for(int i : arr) {
			sb.append(i);
		}
		return sb.toString();
	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}