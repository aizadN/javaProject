package problemSolving;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the word");


        String word = sc.next();
        String reversed = "";
        for( int i = word.length() -1;  i >=0 ; i--){
            reversed = reversed + word.charAt(i);
        }
        System.out.println(reversed);
    }
}