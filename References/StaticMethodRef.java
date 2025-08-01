package References;

import java.util.function.BiFunction;

class MathUtils {
    public static int add(int a, int b) {
        return a + b;
    }
}

public class StaticMethodRef {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> adder = MathUtils::add;
        System.out.println("Sum: " + adder.apply(10, 20));  // Output: 30
    }
}
