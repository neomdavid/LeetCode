package ValidParentheses;
import java.util.Stack;

class usingStack {
    public boolean isValid(String s) {
       Stack<Character> stack = new Stack<>();

       for (char c : s.toCharArray()) {
           if (c == '(' || c == '{' || c == '[') {
               stack.push(c);
           } else {
               if (stack.isEmpty()) {
                   return false;
               }
               char poppedC = stack.pop();
               if ((poppedC == '(' && c != ')') || 
                   (poppedC == '{' && c != '}') || 
                   (poppedC == '[' && c != ']')) {
                   return false;
               }
           }
       }
       return stack.isEmpty();
    }
}
