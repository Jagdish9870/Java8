package Bi;
import java.util.function.*;
public class BiFunctionEx {
    public static void main(String[] args) {
        BiFunction<String,String,Integer> biFunction=(x,y) ->x.length()+y.length(); 
        System.out.println(biFunction.apply("Hello ", "world"));
    }
    
}
