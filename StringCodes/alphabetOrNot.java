package StringCodes;

import java.util.Scanner;

public class alphabetOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter alphabet");
        char c = scanner.next().charAt(0);

        if((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')){
            System.out.println(c +" is an alphabet letter");
        }else{
            System.out.println(c+" is not an alphabet letter");
        }
        scanner.close();
    }
}
