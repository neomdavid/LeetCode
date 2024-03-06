package ContainsDuplicate;

import java.util.HashMap;

class HashMapping {
  public boolean containsDuplicate(int[] nums) {
      HashMap <Integer, Integer> map = new HashMap();

      for (int i = 0; i <nums.length; i++){
          Integer value = map.get(nums[i]);

          if(value == null){
              map.put(nums[i], 0);
          } else{
              return true;
          }
      }
      return false;
  }
}