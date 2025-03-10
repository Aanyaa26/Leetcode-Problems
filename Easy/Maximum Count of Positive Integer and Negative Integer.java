Date: 10.03.25
  class Solution {
    public int left(int [] nums){
        int start =0; 
        int end = nums.length-1;
        int index = nums.length;

        while(start<=end){
            int mid = start + ((end - start)/2);
            if(nums[mid] <0){
                start = mid+1;
            }else if(nums[mid]>=0){
                          
                end = mid-1;
                index = mid;

            }
        }
            return index;
        }
    

    public int right(int [] nums){
        int start =0;
        int end = nums.length-1;
        int index = nums.length;

        while(start<=end){
            int mid = start + ((end - start)/2);
            if(nums[mid] <=0){
                start = mid+1;
            }else if(nums[mid]>0){
                          
                end = mid-1;
                index = mid;

            }
        }
            return index;
        
        }
    

    public int maximumCount(int[] nums) {
        // int negative = 0;
        // int positive =0;

        // for(int i=0; i<nums.length; i++){
        //     if(nums[i]<0){
        //         negative++;
        //     }
        //     else if(nums[i]>0){
        //         positive ++;
        //     }
        // }
        // return Math.max(positive, negative);

        int positive = nums.length-right(nums);
        int negative = left(nums);

        return Math.max(positive, negative);

        
    }
}
