Date: 14.09.24
Easy
  class Solution {
    public List<Integer> stableMountains(int[] height, int threshold) {
        int n = height.length;
        List<Integer> ans = new ArrayList<>();
        for (int i =1; i<n; i++){
            if(height[i-1]>threshold){
                ans.add(i);

            }
        }
        return ans;

    }
}
