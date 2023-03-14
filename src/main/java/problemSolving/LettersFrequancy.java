package problemSolving;

import java.util.Scanner;

public class LettersFrequancy {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a  world");
//        String word = sc.nextLine(); //apple




//        for(int i=0; i < word.length(); i++){
//            int counter = 0;
//            for ( int  o = 0; o < word.length(); o++){
//                if ( word.charAt(i) == word.charAt(o)){
//                    counter++;
//                }
//            }
//            System.out.println(word.charAt(i) + " : " + counter);
//        }

         Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first string");
         String word1 = scanner.nextLine();
        System.out.println( "enter the second string");
        String word2 = scanner.nextLine();
       word1 = word1.toLowerCase();
       word2= word2.toLowerCase();
        System.out.println(word1+word2.toUpperCase().charAt(0) + word2.substring(1));







    }
}
