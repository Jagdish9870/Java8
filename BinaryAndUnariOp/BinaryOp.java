package BinaryAndUnariOp;

import java.util.function.BinaryOperator;

public class BinaryOp {
    public static void main(String[] args) {
        BinaryOperator<String> binaryOperator=(str1,str2)-> str1+ str2;
        System.out.println(binaryOperator.apply("jack", "son"));
    }
    
}
