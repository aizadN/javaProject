package loops;

import java.util.Scanner;

public class HomeworkPracticeBreakAndContinue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        for(int i = 1; i <number; i ++){
            if (number >= 3){
                if (number % 3 == 0 && number % 5 != 0){
                    System.out.println(i);
            }

            }else if (number < 0){
                System.out.println("input must be positive");
            }else {
                System.out.println("There are no integers less than " + number + "that are divisible by 3");
            }
        }

    }
}
