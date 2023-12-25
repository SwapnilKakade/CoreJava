package StringCodes;

import java.util.Scanner;

public class VowelorConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = sc.nextLine();

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                System.out.print(c + "");
            }
        }
        sc.close();
    }
}
