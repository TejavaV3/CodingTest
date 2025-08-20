class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        if(ineq.equals(">")){
            if(eq.equals("=")){
                if((n-m)>=0){
                   return 1; 
                }else{
                    return 0;
                }
            }else{
                if((n-m)>0){
                    return 1;
                }else{
                    return 0;
                }
            }
        }else{
            if(eq.equals("=")){
                if((m-n)>=0){
                   return 1; 
                }else{
                    return 0;
                }
            }else{
                if((m-n)>0){
                    return 1;
                }else{
                    return 0;
                }
            }
        }
    }
}