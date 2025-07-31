package StreamApi;

import java.util.Arrays;
import java.util.List;

public class PaewllelStreamEx {
    public static void main(String[] args) {

        //parallel stream do works same as stream but on big list , it divides that list in small parts and assign threads to parallel operations
        List<Integer> list=Arrays.asList(1,2,3,5,4,6);
        list.parallelStream();
    }
    
}
