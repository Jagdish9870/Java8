package Predicates;

import java.util.function.Predicate;

public class isPalindrome {
        public static void main(String[] args) {
        Predicate<String> stringStartsWith=x -> x.toLowerCase().charAt(0)=='j';
        Predicate<String> stringEndsWith=x -> x.toLowerCase().charAt(0)=='j';

        System.out.println(stringStartsWith.test("ramsen"));
        System.out.println(stringStartsWith.test("jack"));
    }
    
}
