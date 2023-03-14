package loops;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        /*
        write a program that genetates a rondom number between 1 to 100 ask use to enter number,
        the programm should say "Too low, try  again", if guessed number is lower
         */


        int randomNumber = new Random().nextInt(1, 100);
      Scanner scanner = new Scanner(System.in);
      int number;
        do {
            System.out.println("enter number");
            number = scanner.nextInt();
            if (number > randomNumber){
                System.out.println("too low");
            } else if (number<randomNumber){
                System.out.println("too high");
            }
            else {
                System.out.println("you guess");
                break;
            }
            if (number >1 || number< 100){
                System.out.println("enter number in range");
            }
        } while(number!=randomNumber);

        }
}