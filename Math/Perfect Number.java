Date: 26.09.24
class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum =0;
        for(int i=1; i<=num; i++){
            if(num%i ==0){
               int a = num/i;
               if(a!=num){
                sum = sum+a;
               }
               
            }
        }
        if(sum!=num){
            return false;
        }
        return true;

    }
}
