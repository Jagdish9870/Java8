package ConsumerAndSupplier;
import java.util.function.*;
public class SupplierEx {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Hello";
        System.out.println(supplier.get());
    }
    
}