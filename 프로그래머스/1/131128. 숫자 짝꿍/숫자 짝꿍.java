class Solution {
    public String solution(String X, String Y) {
         int arr1[] = new int[10];
        for(int i=0; i<X.length(); i++){
            arr1[(X.charAt(i)- '0')]++;
        }
         int arr2[] = new int[10];
        for(int i=0; i<Y.length(); i++){
            arr2[(Y.charAt(i)- '0')]++;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=9; i>=0; i--){
           if(arr1[i]>0 && arr2[i]>0){
               int a = Math.min(arr1[i],arr2[i]);
               for(int j=0; j<a; j++){
                    // String answer += i 시간 초과 -> StringBuilder 사용
                   sb.append(i);
               }
           }
        }
        if(sb.length()==0){ //입력이 없을 시 
            return "-1";
        }else if(sb.charAt(0)=='0'){ // char 비교는 ''
            return "0";
        }
        return sb.toString();
    }
}