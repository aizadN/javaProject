package loops;

import java.util.Scanner;

public class NergativeNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;

        do{
            System.out.println("Enter negative number");
            number = scanner.nextInt();

        }while (number >=0 );


    }
}
