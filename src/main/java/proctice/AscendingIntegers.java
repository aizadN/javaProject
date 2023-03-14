package proctice;

import java.util.Scanner;

public class AscendingIntegers {
    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);
        System.out.println("Enter first numbers");
        int a = aa.nextInt();

        int b = aa.nextInt();
        System.out.println("Enter  second number");

        int c = aa.nextInt();
        System.out.println("Enter third number");


        if (b > a && b > c) {
            if (a > c) {
                System.out.println(a + "+" + b + "+" + c);
            } else {
                System.out.println(b + "+" + c + "+" + a);
            }

        } else {
            if (b > a) {
                System.out.println(c + "+" + b + "+" + a);
            } else {
                System.out.println(c + "+" + a + "+" + b);
            }

        }
    }
}