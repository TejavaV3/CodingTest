import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

class Solution {

	public int[] solution(int[] numbers) {
		// 오름차순 정렬, 중복 제거
        TreeSet<Integer> set = new TreeSet<>();
		// 두 개의 수를 뽑음
		for(int i=0; i<numbers.length; i++) {
			for(int j=i+1; j<numbers.length; j++) {
				// 만들 수 있는 모든 수를 배열에 담음
				set.add(numbers[i] + numbers[j]);
			}
		}
		int[] result = new int[set.size()];
		int i = 0;
		for(int setLength : set) {
			result[i++] = setLength;
		}
		
        return result;
    }
	
}