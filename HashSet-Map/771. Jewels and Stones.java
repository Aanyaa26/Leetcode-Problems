Date: 23.10.24

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet <Character> set = new HashSet <>();
        int count = 0;

        for(char c : jewels.toCharArray()){
            set.add(c);
        }

        for(char ch : stones.toCharArray()){
            if(set.contains(ch)){
                count++;
            }
        }
        return count;

    }
}
