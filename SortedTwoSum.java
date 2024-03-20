class SortedTwoSum {
  public int[] twoSum(int[] numbers, int target) {
      int l = 0;
      int r = numbers.length-1;

      while (l < r){
          int curSum = numbers[l] + numbers[r];
          if(curSum > target){
              r--;
          } else if (curSum < target){
              l++;
          } else{
              return new int [] {l+1, r+1};
          }
      }
          return new int [] {-1, -1};

  }
}