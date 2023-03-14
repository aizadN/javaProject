package loops;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");

        int number = scanner.nextInt();
        int sum = 0;

        if (number > 0){
            int i = 1;
             while (i <= number){
               if ( i % 2 != 0) {
                   sum += i;
               }
                     i++;
                 }
                  System.out.println( "Sum of odd integers to " + number + " is " +sum);
                 } else {
            System.out.println("number must be positive");
        }


        }
    }