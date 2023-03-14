package problemSolving;

import java.util.Scanner;

public class ProblemSolvingFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter positive number");
        int num = sc.nextInt();
        int  factorial = 1;
        int i = 1;

        if (num > 0){
        while(i <=num)
        {
             factorial *= i;
            i++;
        }
            System.out.println(  "Factorial of  "  + num + "  : is " + factorial);

        } else {
            System.out.println("input must be positive");
        }


    }
}
