import java.util.Arrays;
import java.util.Stack;

class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        Car[] cars = new Car[n];
        for (int i = 0; i < n; i++) {
            cars[i] = new Car(position[i], (double)(target - position[i]) / speed[i]);
        }
        Arrays.sort(cars, (a, b) -> Integer.compare(b.position, a.position));
        
        Stack<Double> stack = new Stack<>();
        for (Car car : cars) {
            if (stack.isEmpty() || car.time > stack.peek()) {
                stack.push(car.time);
            }
        }
        
        return stack.size();
    }
    
    class Car {
        int position;
        double time;
        
        Car(int position, double time) {
            this.position = position;
            this.time = time;
        }
    }
}
