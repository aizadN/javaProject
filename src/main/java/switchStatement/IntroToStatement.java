package switchStatement;

import java.util.Scanner;

public class IntroToStatement {
    public static void main(String[] args) {



//        Write a program that takes symbol and prints corresponding meaning. Use switch statement.
//
//        ! => exclamation mark
//        ? => question mark
//        % => modulus
//        # => hash
//                * => star
//        @ => at
//        $ => dollar sign
        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();
//
//        switch (num) {
//            case 23:
//                System.out.println("hello from 1 block");
//                break;
//            case 12:
//                System.out.println("hello from 2 block");
//                break;
//            case 54:
//                System.out.println("hello from 3 block");
//                break;
//            case 43:
//                System.out.println("hello from 4 block");
//                break;
//            case 678:
//                System.out.println("hello from 5 block");
//                break;
//            case 32:
//                System.out.println("hello from 6 block");
//                break;
//            default:
//                System.out.println("we dont know which number did you write!");
//        }

       // String symbol = scanner.next();

//        switch (symbol) {
//            case  "!":
//                System.out.println("exclamation mark");
//                break;
//            case "?":
//                System.out.println("question mark");
//                break;
//            case "%":
//                System.out.println("modulus");
//                break;
//            case "#":
//                System.out.println("hash");
//                break;
//            case "*":
//                System.out.println("star");
//                break;
//            case "@":
//                System.out.println("at");
//                break;
//            case "$":
//                System.out.println("dollar sing");
//                break;
//            default:
//                System.out.println("We do not have this symbol");
//        }



//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number from 1 to 6");
//        int month = sc.nextInt();
//
//        if (month == 1){
//            System.out.println("January");
//        }
//        else if (month == 2){
//            System.out.println("February");
//        }
//        else if (month == 3){
//            System.out.println("March");
//        }
//        else if (month == 4){
//            System.out.println("April");
//        }
//        else if (month == 5){
//            System.out.println("May");
//        }
//        else if (month == 6){
//            System.out.println("June");
//        }
//        else{
//            System.out.println("Invalid number");
//        }
//



        int number = 10;

        switch ( 2){

            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            default:
                System.out.println("INVALID NUMBER");
                break;

        }


//        ===========================================================================


        String digit = "three";

        switch (digit){
            case "one":
                System.out.println(1);
                break;
            case "two":
                System.out.println(2);
                break;
            case "three":
                System.out.println(3);
                break;
            case "four":
                System.out.println(4);
                break;
            case "five":
                System.out.println(5);
                break;
            default:
                System.out.println("Invalid number");
                break;
        }




        byte day = 7;


        switch (day) {
            case 1, 2, 3, 4, 5:
                System.out.println("Weekday");
                break;
            case 6, 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid day");
        }
       // 10.Write a program that asks the user to enter a month(as an integer),
        // and the noutputsthenumberofdaysinthatmonth.
        // Assumethattheyearisnotaleapyear.1,3,5,7,8,10,12===>31days2==>28days4,6,9,11==>30dayselse=>invalidmonth
        Scanner scanner1 = new Scanner(System.in);
        System.out.println( "Enter a month");
        int  month = scanner1.nextInt();

        switch (month){
            case 1,3,5,7,8,10,12 :
                System.out.println("31 days");
                break;
            case 2:
                System.out.println("28 days");
                break;
            case 4,6,9,11:
                System.out.println("30 days");
                break;
            default:
                System.out.println("invalid month");

        }





    }
}
