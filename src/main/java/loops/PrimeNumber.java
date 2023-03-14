package loops;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        /*
        prime numbers are numbers that can only be divided by 1 and itself
         */


        /*
        0  1 1  2 3  5 8 13 21  fibonacci series
         */
       Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        boolean isPrime = true;
         for( int i = 2 ; i < number ; i ++){
             if(number % i == 0 ){
                 isPrime = false;
                 break;
             }
         }
         if (isPrime){
             System.out.println("Number is prime");
         }else {
             System.out.println("number is NOT prime");

        }





    }
}
