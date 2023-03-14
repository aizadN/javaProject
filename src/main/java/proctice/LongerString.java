package proctice;

import java.util.Scanner;

public class LongerString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First word");
        String word1 = scanner.next();

        System.out.println("Enter second word");
        String word2 = scanner.next();

        if(word1.length() > word2.length()){
            System.out.println(word1 + ": " +word1.length());
        }
        else if (word2.length() > word1.length()){
            System.out.println(word2 + ":" + word2.length());
        }
        else {
            System.out.println(word1 + "" + word2 + ":" + word1.length() );
        }
    }
}
