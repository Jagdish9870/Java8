package Predicates;
import java.util.function.Predicate;

public class StartOrEndWith {
    public static void main(String[] args) {
        Predicate<String> startsWith=x -> x.toLowerCase().charAt(0)=='j';
        Predicate<String> endsStartsWith=x -> x.toLowerCase().charAt(x.length()-1)=='k';
       Predicate<String> or= startsWith.or(endsStartsWith);
       System.out.println(or.test("jacky"));
       System.out.println(or.test("Mack"));
       System.out.println(or.test("naman"));
    }
    
}
