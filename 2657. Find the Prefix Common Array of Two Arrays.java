class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();

        int [] ans = new int [A.length];
        int count =0;
        for (int i=0; i<A.length; i++){
            if(A[i]==B[i]){
                count ++;
                map2.put(B[i],i);
                map.put(A[i],i);
                ans[i] = count;

            }
            else if(A[i]!=B[i]){
                if(map2.containsKey(A[i])&& map.containsKey(B[i])){
                    count+=2;
                    ans[i]=count;
                    map2.put(B[i],i);
                    map.put(A[i],i);

                }else if(map2.containsKey(A[i])|| map.containsKey(B[i])){
                    count++;
                    ans[i]=count;
                    map2.put(B[i],i);
                    map.put(A[i],i);
                }
                else{
                ans[i] = count;
                map2.put(B[i],i);
                map.put(A[i],i);

                }
            }
        }
        return ans;
    }
}
