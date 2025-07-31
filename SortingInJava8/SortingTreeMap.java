package SortingInJava8;
import java.util.*;

public class SortingTreeMap {
    public static void main(String[] args) {
        
        Map<Integer,String> m= new TreeMap<>();
        m.put(4,"dam" );
        m.put(5,"jack" );
        m.put(12,"srim" );
        m.put(1,"allu" );
        System.out.println("before sorting :"+ m);

        Map<Integer,String> m2= new TreeMap<>((a,b)->b-a);
        m2.put(4,"dam" );
        m2.put(5,"jack" );
        m2.put(2,"srim" );
        m2.put(1,"allu" );
        m2.put(6,"kk" );
        System.out.println("after sorting :"+ m2);

    }
    
}
