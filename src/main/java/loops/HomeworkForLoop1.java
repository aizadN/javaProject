package loops;

import java.util.Scanner;

public class HomeworkForLoop1 {
    public static void main(String[] args) {
        //1  Write a Java program to print the numbers which are divisible by 5,
        //  from 1 to 50 using a for loop.

        for (int i = 1; i <= 50; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
        System.out.println(" =================================");
        //2 Write a Java program to print the even numbers from 2 to 20 using a for loop.
        for(int  q = 2; q <= 20; q++){
            if (q % 2 == 0){
                System.out.println(q);
            }
        }
        System.out.println("==============================");

        //3 Write a Java program to print the first 10 natural numbers in reverse order using a for loop.
        for (int o = 10; o >= 1; o --) { //more than
            System.out.println(o);
        }
        System.out.println("==============================");

        //4  Write a Java program to print the multiplication table of 5 using a for loop.

        int number = 5;
        for (int t = 1; t <= 5; t++) {
            System.out.println(number + " * " + t + " = " + (number * t));
        }
        System.out.println("==============================");

        //5  Write a Java program to print the first 20 odd numbers using a for loop.

        for (int q = 0; q <= 20; q++) {
            if (q % 2 != 0) {
                System.out.println(q);
            }
        }

        System.out.println("==============================");
        //6 Write a Java program to calculate the sum of the first 50 even numbers using a for loop.
        int  evenSum = 0;
        for(int i = 1; i <= 50; i++){
            if ( i % 2 == 0){
                evenSum = evenSum + i;
            }
        }
        System.out.println("the sum of even numbers :"  + " = " + evenSum);

        System.out.println("==============================");



        //8. Write a Java program to print the following pattern using nested for loops:
            for (int i = 1; i <= 5 ; i++){
                for( int k = 5; k >= i; k--){
                    System.out.print("*");
                }
                System.out.println("" );
            }
        System.out.println("==============================");
       // 9. Write a Java program to print the following pattern using nested for loops:

        for (int i = 1 ; i <=4 ; i++){
            for (int k = 1 ; k <= i ; k++){
                System.out.print(i);
            }
            System.out.println("");
        }





















        }
    }
