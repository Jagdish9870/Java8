package ConsumerAndSupplier;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;
public class ConsumerEx {
    public static void main(String[] args) {
        Consumer<Integer>  consumer=x->System.out.println(" example of consumer "+ x); 
        consumer.accept(5);

        Consumer<List<Integer>>  consumer2=li->{
            for(Integer i:li){
                System.out.println(i*5);
            }

        }; 
        consumer.accept(5);
        consumer2.accept(Arrays.asList(2,5,6,7));

    }
    
}
