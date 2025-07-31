package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTypes {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,2,4);
        Stream<Integer> listStream=list.stream();  // converting list into stream
        listStream.forEach(System.out::println);

        String[] arr= {"jack","swamini"};
        Stream<String> arrayStream=Arrays.stream(arr);  // converting array into stream
                arrayStream.forEach(System.out::println);

        Stream.of(1,2,5).forEach(System.out::println);; 
        Stream.iterate(0, n -> n+1)
              .limit(100).forEach(System.out::println);
        Stream.generate(()-> "hello")
              .limit(5).forEach(System.out::println);
    }
    
}
