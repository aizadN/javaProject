package ifElse;

public class HomeworkIfElse2 {
    public static void main(String[] args) {


       // Task 1: Write a program that takes three integers as input and checks if any two of them are equal.
       //  Print "Two of the numbers are equal" if any two of the numbers are equal, and "None of the numbers are equal"
       //   if none of the numbers are equal.
        //  Expected output: Two of the numbers are equal
        int num1 = 5;

        int num2 = 7;

        int num3 = 5;

        if (num1 == num2){
            System.out.println("Equal");
        }else if (num1 == num3){
            System.out.println("Two of the numbers are equal");
        } else {
            System.out.println("NOne of the numbers are equal");
        }

       // Task 2: Write a program that takes an integer as input and checks if it is a multiple of 3 or 5.
        // Print "Multiple of 3 or 5" if the number is a multiple of 3 or 5, and "Not a multiple of 3 or 5"
        // if the number is not a multiple of 3 or 5.

              int num = 9;
              if (num % 3 == 0 || num % 5 == 0){
                  System.out.println("Multiple of 3 or 5");
              } else {
                  System.out.println("Not a multiple of 3 or 5");
              }



        //Task 3: Write a program that takes two integers as input and checks if their sum is even or odd.
        // Print "Even" if the sum is even, and "Odd" if the sum is odd.
              int num6 = 4;
              int num7 = 3;
              if ((num6 + num7) % 2 == 0){
                  System.out.println("Even");
        }else{
                  System.out.println("Odd");
              }

       // Task 4: Write a program that takes an integer as input and checks if it is a prime number or not.
        // A number is prime if it is only divisible by 1 and itself.
        // Print "Prime" if the number is prime, and "Not prime" if the number is not prime.

        int number = 7;
              if(number % 1 == 0 && (number % number) ==0){
                  System.out.println("Prime");
              } else{
                  System.out.println("Nop prime");
              }



    }
}
