import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//I did not solve this, for (int i, a: nums) [in python] is not supported in java
class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums); // Sort the array to use two-pointer approach
        
        ArrayList<List<Integer>> result = new ArrayList<>();
        
        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) { // Skip duplicates
                int l = i + 1;
                int r = nums.length - 1;
                int target = -nums[i]; // Convert three sum problem to two sum problem
                
                while (l < r) {
                    int twoSum = nums[l] + nums[r];
                    if (twoSum == target) {
                        result.add(Arrays.asList(nums[i], nums[l], nums[r]));
                        while (l < r && nums[l] == nums[l + 1]) l++; // Skip duplicates
                        while (l < r && nums[r] == nums[r - 1]) r--; // Skip duplicates
                        l++;
                        r--;
                    } else if (twoSum < target) {
                        l++;
                    } else {
                        r--;
                    }
                }
            }
        }
        
        return result;
    }
}
