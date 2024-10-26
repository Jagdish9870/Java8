package Bi;
import java.util.function.*;
public class BiConsumerEx {
    public static void main(String[] args) {
        BiConsumer<Integer, Integer> biConsumer = (x, y) ->{ 
            System.out.println(x+y);};
        biConsumer.accept(26, 25);
    }
    
}
