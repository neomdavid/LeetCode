import java.util.*;

//study this more
//you have to study this
//tomorrow is gonna be a great day.
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> count = new HashMap<>();

        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] freq = new List[nums.length + 1];

        for (int num : count.keySet()) {
            int frequency = count.get(num);
            if (freq[frequency] == null) {
                freq[frequency] = new ArrayList<>();
            }
            freq[frequency].add(num);
        }

        List<Integer> resList = new ArrayList<>();
        for (int i = freq.length - 1; i >= 0 && resList.size() < k; i--) {
            if (freq[i] != null) {
                resList.addAll(freq[i]);
            }
        }

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = resList.get(i);
        }

        return res;
    }
}
