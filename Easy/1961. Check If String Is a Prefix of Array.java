date: 03-12-24

class Solution {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder temp = new StringBuilder();
        
        for (String word : words) {
            temp.append(word);  
            
            if (temp.toString().equals(s)) {
                return true;  
            }
        }
        
        return false;
    }
}
