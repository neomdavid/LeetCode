class Solution {
  public boolean isAnagram(String s, String t) {
       int characterCount [] = new int [26];

       for(char x: s.toCharArray()){
           characterCount[x-'a']++;
       }
       for(char x:t.toCharArray()){
           characterCount[x-'a']--;
       }

       for(int i: characterCount){
           if(i!=0){
               return false;
           }
       }
       return true;
  }
}