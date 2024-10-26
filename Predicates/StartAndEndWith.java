package Predicates;

import java.util.function.Predicate;

public class StartAndEndWith {
    public static void main(String[] args) {
         Predicate<String> startsWith=x -> x.toLowerCase().charAt(0)=='j';
         Predicate<String> endsStartsWith=x -> x.toLowerCase().charAt(x.length()-1)=='k';
        Predicate<String> and= startsWith.and(endsStartsWith);
        System.out.println(and.test("jack"));

    }
    
}
