package Predicates;

import java.util.Arrays;
import java.util.List;

public class SumOfEvenUsingPredicate {
    public static void main(String[] args) {
       List<Integer> list=Arrays.asList(2,4,5,6,8,3);
      int sumEven= list.stream()
                        .filter(n->n%2==0) 
                        .mapToInt(n->n)
                        .sum();
      System.out.println(sumEven);
    }
    
}
