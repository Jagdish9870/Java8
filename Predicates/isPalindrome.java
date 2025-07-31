package Predicates;

import java.util.function.Predicate;



public class IsPalindrome {
    public static void main(String[] args) {

        // Predicate to check if a string is palindrome
        Predicate<String> isPalindrome = str -> {
            String lower = str.toLowerCase();
            return new StringBuilder(lower).reverse().toString().equals(lower);
        };

        // Test cases
        System.out.println(isPalindrome.test("madam"));   // true
        System.out.println(isPalindrome.test("Racecar")); // true
        System.out.println(isPalindrome.test("hello"));   // false
        System.out.println(isPalindrome.test("level"));   // true
    }
}
