import java.util.Stack;

class dailyTemperaturesailyTemperatures {
  public int[] dailyTemperatures(int[] temperatures) {
      int result [] = new int [temperatures.length];
      Stack <Integer> stack = new Stack();

      for(int i = 0; i < temperatures.length; i++){
          while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
              int element = stack.pop();
              result[element] = i - element;
          }
          stack.push(i);
      }
      return result;
  }
}