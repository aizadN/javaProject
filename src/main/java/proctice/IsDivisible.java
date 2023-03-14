package proctice;

import java.util.Scanner;

public class IsDivisible {
    public static void main(String[] args) {
          int num1 = 10;
          int num2 = 5;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter first number");
        int word= sc.nextInt();
        if((num1 & num2) ==0){
            System.out.println("divisible");
        }else{
            System.out.println("not divisible");
        }






    }
}
