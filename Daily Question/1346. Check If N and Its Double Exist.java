Date: 01.12.24
class Solution {
    public boolean checkIfExist(int[] arr) {
        int n= arr.length;
        if(n<2)return false;        

        for(int i=0; i<n; i++){
            for(int j=0; j<n;j++){
                if(i!=j && arr[i]==arr[j]*2){
                    return true;
                }
            }
            
        }
        return false;
    }
}

// import java.util.HashSet;
// class Solution {
//     public boolean checkIfExist(int[] arr) {
//         HashSet<Integer> set = new HashSet<>();
//         for (int i : arr) {
//             if (set.contains(i * 2)) return true;
//             if (i % 2 == 0 && set.contains(i / 2)) return true;
//             set.add(i);
//         }
//         return false;
//     }
// }
