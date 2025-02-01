Date: 01.02.25
class Solution {
    public boolean isArraySpecial(int[] nums) {
        int n = nums.length;
        if(n==1)return true;

        int i =1;
        while(i<n){
            if((nums[i-1]+nums[i])%2==0){
                return false;
            }else{
                i++;
            }
        }
        return true;
    }
}
