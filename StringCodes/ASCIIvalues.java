package StringCodes;

import java.util.Scanner;

public class ASCIIvalues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        String s = sc.next();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int ascii = (int)c;
            System.out.println(c +" Ascii value "+ ascii);
        }   
        sc.close();
    }
}
