class Solution {
    public int solution(int a, int b) {
        int num1 = Integer.parseInt("" + a + b);
        
        return Math.max(num1, 2*a*b);
    }
}