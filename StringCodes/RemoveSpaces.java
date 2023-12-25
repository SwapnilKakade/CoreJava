package StringCodes;

import java.util.Scanner;

public class RemoveSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        String s = sc.nextLine();

        char c[] = s.toCharArray();
        String newStr  = "";

        for(int i = 0; i < c.length ; i++) {
            if(c[i] != ' '){
                newStr += c[i];
            }
        }
        System.out.println("Remove Strings: " + newStr);
        sc.close();
    }
}
