package proctice;

import java.util.Scanner;

public class RemoveSpaces {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");

        String str = scanner.nextLine();

        System.out.println(str.replace(" " ,""));


    }
}
