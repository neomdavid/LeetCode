import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) {
            return new ArrayList<>();
        }

        HashMap<String, List<String>> hmap = new HashMap<>();

        for (String s : strs) {
            char ch[] = new char[26];
            for (char c : s.toCharArray()) {
                ch[c - 'a']++;
            }
            String unicode = String.valueOf(ch);

            if (!hmap.containsKey(unicode)) {
                List<String> list = new ArrayList<>();
                hmap.put(unicode, list);
            }

            hmap.get(unicode).add(s);
        }

        return new ArrayList<>(hmap.values());
    }
}
