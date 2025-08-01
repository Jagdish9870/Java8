package References;



import java.util.function.Consumer;

class Printer {
    public void print(String message) {
        System.out.println(message);
    }
}

public class InstanceMethodRef {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Consumer<String> consumer = printer::print;
        consumer.accept("Hello from method reference!");  // Output: Hello from method reference!
    }
}
