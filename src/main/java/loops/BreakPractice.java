package loops;

import java.util.Scanner;

public class BreakPractice {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers");

        int num1 = scanner.nextInt();
        int num2  = scanner.nextInt();
        int sum = num1 +num2;


        for(int i = 1; i <= sum; i++){
            System.out.println(i);
            if(i >= 45){
                break;
            }

        }

    }
}
