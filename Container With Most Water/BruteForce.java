class Solution {
  public int maxArea(int[] height) {
      int result = 0;
      
      for(int l = 0; l <height.length; l++){
          for (int r = l+1; r<height.length; r++){
              int area = (r-l)*Math.min(height[r], height[l]);
              result = Math.max(area,result);
          }
      }
      return result;
  }
}