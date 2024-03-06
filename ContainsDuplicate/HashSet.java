package ContainsDuplicate;

import java.util.HashSet;

class Solution {
  public boolean containsDuplicate(int[] nums) {
      HashSet <Integer> map = new HashSet();


      for (int num: nums){
          if(!map.add(num)){
              return true;
          }
      }
      return false;
      /*
      for (int i = 0; i <nums.length; i++){

          if(map.contains(nums[i]) == false){
              map.add(nums[i]);
          } else{
              return true;
          }
      }
      return false;
      */
  }
}
