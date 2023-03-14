package objects;

import java.util.Scanner;

public class CalculatorHw {

    int num1;
    int num2;

    public void add(int num1, int num2){
        int addResult = num1 + num2;
        System.out.println( "Addition result is : " +addResult);
    }

    public void subtract(int num1, int num2){
        int subtractResult = num1 - num2;
        System.out.println("Subtract result is : " + subtractResult);
    }

    public void multiply(int num1,int num2){
        int multiplyResult = num1 * num2;
        System.out.println("Multiply result is :" + multiplyResult);
    }
    public void divide(int num1, int num2){
        int divideResult = num1 / num2;
        System.out.println("Divide result is :" + divideResult);
    }

    public void modulus(int num1,int num2){
        int modulusResult = num1 % num2;
        System.out.println("Modulus result is :" + modulusResult);
    }
    public  int square(int number){

        return number * number;

    }

    public  void factorial( ){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int num3= sc.nextInt();
        int i = 1;
       int  fact= 1;

       for(i =1;i <= num3;i ++ ){
           fact = fact * i;
       }
        System.out.println("Factorial of "+ num3 + " is : " + fact);
    }










    public static void main(String[] args) {
        CalculatorHw calculator = new CalculatorHw();

        calculator.add(10,65);
        calculator.add(6,7);
        calculator.subtract(100, 5);
        calculator.multiply(5,2);
        calculator.divide(4,2);
        calculator.modulus(5,3);
        calculator.modulus(10,4);
        calculator.factorial();
        calculator.square(5);

    }

}
