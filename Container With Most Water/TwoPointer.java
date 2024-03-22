class TwoPointer {
  //I DID IT!!!
  public int maxArea(int[] height) {
      int l = 0;
      int r = height.length-1;
      int result = 0;

      while(l<r){ 
          int area = (r-l)*Math.min(height[r], height[l]);
          result = Math.max(area, result);
          if(height[l]>height[r]){
              r--;
          } else if(height[l]<height[r]){
              l++;
          } else {
              if(height[l+1]> height[r-1]){
                  l++;
              } else if (height[l+1] < height[r-1]){
                  r--;
              } else{
                  l++;
              }
          }
      }
      return result;
  }
}