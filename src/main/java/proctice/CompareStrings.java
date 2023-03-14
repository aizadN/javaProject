package proctice;

import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter two strings");
        String str = scanner.nextLine();
        String str1 = scanner.nextLine();
        if ( str.equals(str1)){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Not equal");
        }
    }
}
