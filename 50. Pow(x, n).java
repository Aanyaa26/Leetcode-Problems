Date: 15.04.25
class Solution {
    public double myPow(double x, int n) {
        if(x==1 || n==0)return 1;
        if(n<0){
            x = 1/x;
            n = -n;
        }

        return helper(x,n);       
        
    }
    //recursion
    public double helper(double x, int n){
        // base case if n becomes 0 return 1
        if(n==0) return 1;
        // if the degree is even
        double half = helper(x,n/2);
        if(n%2==0){
            return half*half;
        } else{
            return half*half*x;
        }
    }
}

// if(n==0)return 1;
//         double ans =x;
        
//             for(int i=1; i<Math.abs(n); i++){
//                 ans = ans*x;
//             }
        
//         if(n<0){
//             ans = 1/ans;
//         }
//         return ans;
