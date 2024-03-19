import java.util.EmptyStackException;
import java.util.Stack;



class MinStack {
  Stack<Integer> stack = new Stack<>();
  Stack<Integer> minStack = new Stack<>();

  public MinStack() {

  }

  public void push(int val) {
      if (stack.isEmpty()) {
          minStack.push(val);
      } else {
          minStack.push(Math.min(minStack.peek(), val));
      }
      stack.push(val);
  }

  public void pop() {
      if (!stack.isEmpty()) {
          stack.pop();
          minStack.pop();
      }
  }

  public int top() {
      if (!stack.isEmpty()) {
          return stack.peek();
      }
      
      throw new EmptyStackException(); // or handle the case based on your requirements
  }

  public int getMin() {
      if (!minStack.isEmpty()) {
          return minStack.peek();
      }
      throw new EmptyStackException(); // or handle the case based on your requirements
  }
}
