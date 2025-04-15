Date: 15.04.25
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<> ();
        
        function(0,ans,nums,new ArrayList<>());
        return ans;
    }
    public void function(int i, List<List<Integer>>ans, int []nums,List<Integer> current){
        if(i==nums.length){
            ans.add(new ArrayList<>(current));
            return;
        }
        
        // pick
        current.add(nums[i]);
        
        function(i+1,ans,nums,current);

        //not pick
        current.remove(current.size()-1);
        function(i+1, ans, nums,current);
    }
}
