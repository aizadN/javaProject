package loops;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
/*

        create a program that asks use to enter
        one number
        arithmetic operator (+, -, *, /, %)
        second number
        output the result

        Ask user if he wants to try again? yes/no
        if yes, calculate again
        if no, stop

        USE DO WHILE LOOP, if-else, switch, Scanner
 */
        Scanner sc = new Scanner(System.in);
        boolean yesNo = true;

        do {
            System.out.println("Enter a first number");
            int num1 = sc.nextInt();

            System.out.println("Enter an operator: + - / * %");
            String str = sc.next();

            System.out.println("Enter second number");
            int num2 = sc.nextInt();

            if (str.equals("+")) {
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
            }
            else if (str.equals("-")) {
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
            }
            else if (str.equals("/")) {
                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
            }
            else if (str.equals("*")) {
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
            }
            else if (str.equals("%")) {
                System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
            }
            else {
                System.out.println("Invalid operator");
            }
            System.out.println("Want to try again : true/ false");
            yesNo = sc.nextBoolean();
        }while (yesNo);



    }
}