package StringCodes;

import java.util.Scanner;

public class LengthOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        String s = sc.next();
        int len = 0 ;
        for (char c  : s.toCharArray()) {
            len++;
        }
        System.out.println("Length of string "+len);
        sc.close(); 
    }
}
