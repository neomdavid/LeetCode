import java.util.HashMap;

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int p1 = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[p1]) {
                p1++;
                nums[p1] = nums[i];
            }
        }
        return p1 + 1;
    }
}
