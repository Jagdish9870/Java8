package Bi;
import java.util.function.*;
public class BiPredicateEx {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> biPredicate= (x,y)-> x%2 == 0 && y % 2 == 0;  // same like predicate but checks on multiple args
        System.out.println(biPredicate.test(2,6));   


        BiPredicate<String, Integer> biPredicate2= (str,y)-> str.length()==y;  // same like predicate but checks on multiple args
        System.out.println(biPredicate2.test("jacks",4));   
    }

    
}
