package proctice;

import java.util.Scanner;

public class CompareInts {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first  integer ");

         int a  = scanner.nextInt() ;
        System.out.println("Enter second integer");
         int b = scanner.nextInt();
        System.out.println("enter third integer");
          int g = scanner.nextInt();

          if(a >b && a >g){
              System.out.println("first integer is larger");
          } else if (a<b && b<g){
              System.out.println("second number is larger");
          } else if (a >b && g > a){
              System.out.println(" third integer is larger");
          }else {
              System.out.println();
          }


    }
}
