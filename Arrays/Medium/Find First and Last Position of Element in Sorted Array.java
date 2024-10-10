Date: 10.10.24

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int []ans = new int[2];
        int start = 0;
        int end = nums.length-1;
        
        ans[0] = -1; 
        ans[1] = -1;

        while(start<=end){
            int mid= (start+end)/2;
            if(nums[mid]==target){
                ans[0] = mid; 
                end = mid - 1;
            }
            else if(nums[mid]<target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
         if (ans[0] == -1) {
            return ans; 
        }
        start = 0;
        end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                ans[1] = mid; 
                start = mid + 1; 
            } else if (nums[mid] < target) {
                start = mid + 1; 
            } else {
                end = mid - 1; 
            }
        }

        return ans;
    }
}
