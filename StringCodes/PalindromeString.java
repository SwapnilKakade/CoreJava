package StringCodes;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.next();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                System.out.println("Not palindrome");
                break;
            }else{
                System.out.println("Palindrome");
             
            }
        }
        sc.close();
    }
}
