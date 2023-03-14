package loops;

import java.util.Scanner;
import java.util.StringJoiner;

public class ReverseStringHomework {
    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
        System.out.println("Enter any world");
         String text = sc.nextLine();
         for( int i = text.length() - 1; i >=0; i--){
             System.out.print(text.charAt(i));
         }


        String name = "Elturan";
         String reverse = "";
         for( int i = name.length() -1; i>=0; i--){
             reverse += name.charAt(i);
         }
        System.out.println(reverse);
    }



}
