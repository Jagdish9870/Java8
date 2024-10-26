package Predicates;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class isOdd {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,3,5,4,2);
        Predicate<Integer> isOdd = x -> x % 2 != 0;
        for(Integer i :list){
            if (isOdd.test(i)) {
                System.out.println(i);
                
            }
        }
        

    }
   

    
}
