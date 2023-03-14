package switchStatement;

import java.util.Scanner;

public class SwitchHomeWork {
    public static void main(String[] args) {
//        Write a program that takes symbol and prints corresponding meaning. Use switch statement.
//
//        ! => exclamation mark
//? => question mark
//% => modulus
//# => hash
//                * => star
//        @ => at
//        $ => dollar sign

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter symbol");
        String symbol = scanner.next();

       switch (symbol) {
            case  "!":
                System.out.println("exclamation mark");
               break;
            case "?":
               System.out.println("question mark");
               break;
            case "%":
                System.out.println("modulus");
                break;
            case "#":
                System.out.println("hash");
                break;
            case "*":
               System.out.println("asterisk");
               break;
            case "@":
                System.out.println("at");
               break;
            case "$":
                System.out.println("dollar sing");
                break;

            default:
                System.out.println("We do not have this symbol");
        }


    }
}
