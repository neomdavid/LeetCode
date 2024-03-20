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
              // there's a difference between l++/r++ and ++l/++r
              return new int [] {++l, ++r};
          }
      }
          return new int [] {-1, -1};

  }
}