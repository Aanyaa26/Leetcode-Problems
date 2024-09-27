Date: 27.09.24

import java.util.HashMap;

class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) - 1);
                
                if (map.get(c) == 0) {
                    map.remove(c);
                }
            } else {
                return c;
            }
        }

        return 0; 
    }
}
