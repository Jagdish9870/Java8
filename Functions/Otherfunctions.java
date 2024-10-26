package Functions;
import java.util.function.*;
public class Otherfunctions {
    public static void main(String[] args) {
        Function<Integer,Integer> function1=x -> x*2;
        Function<Integer,Integer> function2=x -> x*x*x;

        System.out.println(function1.andThen(function2).apply(5));
        System.out.println(function2.andThen(function1).apply(5));  // you can use .compose() too here......

    }
    
}
