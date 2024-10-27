package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFunctionsTypes {
    public static void main(String[] args) {
        // /filter

    List<Integer> list=Arrays.asList(1,2,5,6,5,8);
    List<Integer> filteredlist= list.stream().filter(x->x%2==0).collect(Collectors.toList());
        System.out.println(filteredlist);

       List<Integer> mappList= filteredlist.stream().map(x->x/2).collect(Collectors.toList());    // map function..........................
       System.out.println(mappList);



        // .distinct to print only one time in case of  multiple
       // .sorted() for sort the list.
       //sorted((a,b)->b-a)  sorted with comparator to print in descending 
       //.limit()  // to limit the print
       //.skip() to skip desired positions

       List<Integer> list2=Arrays.asList(8,2,1,2,5,6,5,2,0,5);               // for distinct element
    List<Integer> filteredlist2= list2.stream().filter(x->x%2==0).sorted((a,b)->b-a).collect(Collectors.toList());
        System.out.println(filteredlist2);






        List<Integer> filteredlist3= Stream.iterate(0,x->x+1).limit(101).skip(1).filter(x-> x%2 ==0).map(x->x/10).distinct().collect(Collectors.toList());
            System.out.println(filteredlist3);

            //System.out :: println  -> method reference
            //.count() to count the element 
        Integer filteredlist4= Stream.iterate(0,x->x+1).limit(101).map(x->x/20).distinct().peek(System.out ::println).max((a,b)->a-b).get();
        System.out.println("max : "+filteredlist4);
       


        
    }

    
    
}
