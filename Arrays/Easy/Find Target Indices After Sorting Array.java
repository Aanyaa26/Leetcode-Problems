Date: 09.10.24

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            if(target==nums[i]){
                ans.add(i);
            }
        }
        return ans;
    }
}
