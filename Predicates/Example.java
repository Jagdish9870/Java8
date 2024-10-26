package Predicates;

import java.util.function.Predicate;
public class Example {
    public static void main(String[] args) {
        Predicate<Integer> predicate=x -> x >500;     // returns boolean value
        System.out.println(predicate.test(1200));

        int price=520;
        System.out.println(predicate.test(price));

    }
    
}
