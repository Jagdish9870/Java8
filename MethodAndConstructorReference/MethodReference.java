package MethodAndConstructorReference;

import java.util.*;

public class MethodReference {
    public static void print(String name){
        System.out.println(name);
    }
    public static void main(String[] args) {
        List<String> students=Arrays.asList("jack" ,"john","alice");
        students.forEach(MethodReference::print);               // here we use :: in place of lambda expression   x->sout(x);

        List<String> names = Arrays.asList("john", "alice", "bob");

        // Sort using method reference
        names.sort(String::compareToIgnoreCase);

        System.out.println(names); // [alice, bob, john]

        
    }
    
}
