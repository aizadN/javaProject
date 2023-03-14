package ifElse;

import java.util.Scanner;

public class IfElseHomework1 {
    public static void main(String[] args) {
        //1. Write a program that checks whether the number is positive, negative, or zero.
        // The program should print out a message indicating the result.

        int number = 40;
        if (number < 0 || number > 0) {
            System.out.println("Number is positive");
        } else if (number == 0) {
            System.out.println("number is equal to zero");
        } else {
            System.out.println("Number is negative");

        }

        // Write a program that  checks whether the year is a leap year or not.
        //A year is a leap year if it is divisible by 4 but not divisible by 100, or if it is divisible by 400.
        //The program should print out a message indicating the result.

        int year = 2019;
        if ((year % 4 == 0  && year % 100 != 0 )||year % 400 ==0){
            System.out.println(" is a leap year");
        } else {
            System.out.println("is not a leap year");
        }





        // 3. Write a program that checks which int is larger.
        // The program should print out a message indicating the result.
        int num1 = 3;
        int num2 = 123;

        if (num1 > num2) {
            System.out.println("num 1 is larger than number 2 ");
        } else if (num1 < num2) {
            System.out.println("num1 is less than num2");

        }


        //4. Write a program that checks whether the temperature is below freezing (32 degrees or lower),
        // above boiling (212 degrees or higher), or in between.
        // The program should print out a message indicating the result.

        double tempInFahrenheit = 72.6;
        if (tempInFahrenheit <= 32 ) {
            System.out.println("freezing");
        } else if (tempInFahrenheit >= 212) {
            System.out.println("boiling");
        } else  if (tempInFahrenheit >32 && tempInFahrenheit < 212){
            System.out.println("in between");
        }


        // 5. Write a program that checks the months and tells which season it is (winter, spring, summer, or fall).
        // Assume that winter starts in December, spring starts in March, summer starts in June, and fall starts in September.
        // The program should print out a message indicating the result.

       // byte month = 6;
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("vvedite chislo mesyasa:");
//        int month1 = scanner.nextInt();
        byte month1 = 6;
        if (month1 == 12 || month1 == 1 || month1 == 2) {
            System.out.println("winter");
        } else if (month1 == 3 || month1 == 4 || month1 == 5) {
            System.out.println("spring");
        } else if (month1 == 6 || month1 == 7 || month1 == 8) {
            System.out.println("summer");
        } else if (month1 == 9 || month1 == 10 || month1 == 11) {
            System.out.println("fall");
        } else {
            System.out.println("does not exist ");

        }


    }

}