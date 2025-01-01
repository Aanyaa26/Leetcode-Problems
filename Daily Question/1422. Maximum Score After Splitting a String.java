Date: 01.01.25

// BRUTE FORCE
class Solution {
    public int maxScore(String s) {
        int result = Integer.MIN_VALUE;
        int n = s.length();
        char [] c = s.toCharArray();


        // split can happen upto second last element -- non empty string!

        for(int i =0; i<=n-2; i++){

            // count of zero from 0 to i
            int zero_count = 0;
            for(int j=0; j<=i ; j++){
                if(c[j]== '0'){
                    zero_count++;
                }
            }

            int ones_count =0;
            for(int k= i+1; k<= n-1; k++){
                if(c[k]=='1'){
                    ones_count++;
                }
            }

            result = Math.max(result , (zero_count+ ones_count));
        }
        return result;
    }
}
