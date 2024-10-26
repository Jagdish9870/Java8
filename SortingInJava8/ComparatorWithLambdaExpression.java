package SortingInJava8;
import java.util.*;
import java.util.ArrayList;

//before java 8.............................................................................
// class sortList implements Comparator<Integer>{

//     @Override
//     public int compare(Integer a, Integer b) {
       
//         //return a-b;   // for ascending order
//         return b-a;  // for descending order
//     }
    
// }
// public class ComparatorWithLambdaExpression {
//     public static void main(String[] args) {
//         List<Integer> list= new ArrayList<>();
//         list.add(1);
//         list.add(4);
//         list.add(2);
//         list.add(9);
//         Collections.sort(list,new sortList());
//         System.out.println(list);
        
//     }
    
// }


//but in java 8 we don't need to specify another class for that .................................................................
public class ComparatorWithLambdaExpression {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(2);
        list.add(9);
        Collections.sort(list,(a,b)->b-a);  // by writing this expression {(a-b)-> b-a } we can sort this 
        System.out.println(list);
        
    }
    
}
