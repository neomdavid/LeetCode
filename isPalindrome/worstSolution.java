package isPalindrome;

class worstSolution {
  public boolean isPalindrome(String s) {
      String newStr = "";
      
      for (char c : s.toCharArray()) {
          if (Character.isLetterOrDigit(c)) {
              newStr += Character.toLowerCase(c);
          }
      }

      int i = 0, j = newStr.length() - 1;
      while (i < j) {
          if (newStr.charAt(i) != newStr.charAt(j)) {
              return false; // Not a palindrome
          }
          i++;
          j--;
      }
      return true; // Palindrome
  }
}
