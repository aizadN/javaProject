package problemSolving;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter");
        String word = scanner.nextLine();
//        String  reversed = "";
//        for (int i = word.length() -1; i >=0; i-- ){
//            reversed = reversed+ word.charAt(i);
//
//        }
//       // System.out.println(reversed);
//        if(reversed.equals(word)){
//            System.out.println("true");
//        }
//        else{
//            System.out.println("false");
//        }

     /*             ==============================another way============================================
     Scanner scanner = new Scanner(System.in);
String word = scanner.nextLine();

int length = word.length();
boolean isPalidrome = true;


for (int i = 0; i < length / 2; i++){
    if (word.charAt(i) != word.charAt(length-1-i)){
        isPalidrome = false;
    }
}

System.out.println(isPalidrome);
      */

    }
}
