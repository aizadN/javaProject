package loops;

import java.util.Scanner;

public class HomeworkFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter positive number");
        int number = scanner.nextInt();
        int  factorial = 1;



       if (number > 0 ){
           for (int i = number; i >0 ;i --) {
               factorial *= i;

           }
           System.out.println(factorial);
       }else {
           System.out.println("number must be positive");
       }



    }
}
