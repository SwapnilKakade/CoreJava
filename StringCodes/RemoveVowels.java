package StringCodes;

import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string  ");
        String s = sc.next();
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                str = str + "";
            }else{
                str = str + c;
            }
        }
        System.out.println("Remove vowels string "+str);
        sc.close();
    }
}
