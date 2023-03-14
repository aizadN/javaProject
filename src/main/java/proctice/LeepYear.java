package proctice;

import java.util.Scanner;

public class LeepYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a month: 1 -12");

        int month1 = scanner.nextInt();


        if (month1 == 1 || month1 == 3 || month1 == 5 || month1 == 7 || month1 == 8 || month1 == 10 || month1 == 12) {
            System.out.println("31 days");
        } else if (month1 == 2) {
            System.out.println("28 days");
        } else if (month1 == 4 || month1 == 6 || month1 == 9 || month1 == 11) {
            System.out.println("30 days");
        } else {
            System.out.println("invalid month");
        }
    }
}
