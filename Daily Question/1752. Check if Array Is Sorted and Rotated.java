Date: 02.02.24
class Solution {
    public boolean check(int[] nums) {
        int count =0;
        int n = nums.length;
        for(int i =1; i<nums.length; i++){
            if(nums[i]<nums[i-1])count++;
        }
        if(nums[n-1]>nums[0]) count++;
        if(count <=1) return true;
        else return false;
    }
}
