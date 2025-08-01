package References;


import java.util.Arrays;

public class ArbitraryObjectMethodRef {
    public static void main(String[] args) {
        String[] names = {"John", "Annie", "Zoe", "Mark"};
        
        // Sort using method reference
        Arrays.sort(names, String::compareToIgnoreCase);

        for (String name : names) {
            System.out.println(name);
        }
    }
}

