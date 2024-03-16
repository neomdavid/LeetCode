package LongestCommonPrefix;
class Solution {

  //I did not solve this, I have to do this again
  public String longestCommonPrefix(String[] strs) {
      if (strs == null || strs.length == 0) {
          return "";
      }
      
      // Take the first string as a reference
      String prefix = strs[0];
      
      for (int i = 1; i < strs.length; i++) {
          String current = strs[i];
          int j = 0;
          // Compare characters of current string with the prefix
          while (j < prefix.length() && j < current.length() && prefix.charAt(j) == current.charAt(j)) {
              j++;
          }
          // Update prefix to common characters
          prefix = prefix.substring(0, j);
          
          // If prefix becomes empty, then there's no common prefix
          if (prefix.isEmpty()) {
              return "";
          }
      }
      
      
      return prefix;
  }
}
