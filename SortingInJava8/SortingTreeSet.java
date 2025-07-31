package SortingInJava8;
import java.util.*;
public class SortingTreeSet {
    public static void main(String[] args) {
        Set<Integer> ts = new TreeSet<>();
        ts.add(5);
        ts.add(4);
        ts.add(8);
        ts.add(8);
        ts.add(9);
       
        

        System.out.println("before sorting :"+ ts);
        Set<Integer> ts2 = new TreeSet<>((a,b)->b-a);
        ts2.add(5);
        ts2.add(4);
        ts2.add(8);
        ts2.add(9);
       

        System.out.println("after sorting :"+ ts2);
    }
   
    
}
