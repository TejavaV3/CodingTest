class Solution {
	public int[][] solution(int[][] arr1, int[][] arr2) {

		// arr1과 arr2 매칭
		int[][] answer = new int[arr1.length][arr2[0].length];
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2[0].length; j++) {
				int temp = 0;
				for (int k = 0; k < arr1[i].length; k++) {
					temp = temp + arr1[i][k] * arr2[k][j];
				}
				answer[i][j] = temp; // answer 배열에 값 저장
			}
		}

		// 전달
		return answer;
	}
}