Date: 04.12.24

class Solution {
    public int waysToSplitArray(int[] nums) {
        int n = nums.length;
        int count =0;
        long total_sum = 0;

        // for total_sum
        for(int i=0; i<n; i++){
            total_sum = total_sum + nums[i];
        }

        // split such that no non empty array exist

        long left_sum = 0;
        long right_sum = 0;
        

        for(int i=0; i<n-1; i++){

            left_sum = left_sum + nums[i];
            right_sum = total_sum - left_sum;        

            

            if(left_sum>=right_sum){
                count++;
            }
        }
        return count;
    }
}
