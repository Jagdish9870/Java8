package Functions;
import java.util.function.Function;
public class FunctionLikePredicate {
    public static void main(String[] args) {

        // this function returns the length of String
        Function<String ,Integer> function=x-> x.length();
        System.out.println(function.apply("Hello"));
    }
    
}
