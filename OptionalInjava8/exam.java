package OptionalInjava8;

import java.util.NoSuchElementException;
import java.util.Optional;

public class exam {
    public static void main(String[] args) {
        Optional<String> name=getName(2);
        if(name.isPresent()){
            System.out.println(name.get());
        }

        // both do the same work
        name.ifPresent(System.out::println);  // by functional programming

        // if want to print default name in case of null

        Optional<String> fullname=getFullName(2);
        String nameIs=fullname.orElse("there is no name");
        System.out.println(nameIs);

        String nameException=fullname.orElseThrow(()-> new NoSuchElementException());   //orElseThrow
        System.out.println(nameException);
        
    }

    private static Optional<String> getName(int id) {
        String name="jack";
        return Optional.ofNullable(name);
    }
    private static Optional<String> getFullName(int id) {
       
        return Optional.empty();
    }

    
}
