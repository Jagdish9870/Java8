package BinaryAndUnariOp;

import java.util.function.UnaryOperator;

public class UnaryOp {
    public static void main(String[] args) {
        UnaryOperator<Integer> unaryOperator=x -> x*x;   //used when input and output are same..............
        System.out.println(unaryOperator.apply(5));
    }
    
}
