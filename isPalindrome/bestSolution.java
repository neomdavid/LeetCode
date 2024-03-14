package isPalindrome;

class Solution {
  public boolean isPalindrome(String s) {
      // Define pointers for start and end of the string
      int i = 0, j = s.length() - 1;
      
      // Loop until the pointers meet or cross each other
      while (i < j) {
          // Skip non-alphanumeric characters from left
          while (i < j && !Character.isLetterOrDigit(s.charAt(i))) {
              i++;
          }
          // Skip non-alphanumeric characters from right
          while (i < j && !Character.isLetterOrDigit(s.charAt(j))) {
              j--;
          }
          // Compare characters
          if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
              return false; // Not a palindrome
          }
          // Move pointers inward
          i++;
          j--;
      }
      // If we reach here, the string is a palindrome
      return true;
  }
}
