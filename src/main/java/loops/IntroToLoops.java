package loops;

import java.util.Scanner;

public class IntroToLoops {
    public static void main(String[] args) {

//        System.out.println("1");
//        System.out.println("2");
//        System.out.println("3");
//        System.out.println("4");
//        System.out.println("5");
//        System.out.println("6");
//
//        System.out.println("7");
//        System.out.println("8");
//        System.out.println("9");
//        System.out.println("10");

        for (int i = 10; i >= 0 ; i -- ){
            System.out.println(i); ////10,9,8,7,6,5,4,3,2,1,0
        }


         ///
        for (int i = 1; i <= 10 ; i ++ ){
            System.out.println(i); /////1,2,3,4,5,6,7,8,9,10
        }

        ////
        int age;
        for (age = 0 ;  age <100; age ++ ){
            System.out.println("Baby is " + age + " years old");
        }

        for (int  num =0 ;  num <= 22 ; num ++){
            System.out.println(num +  " " +"apple");
        }
         ////
        for(  int num1 = 1 ; num1 <= 20 ; num1 ++){
            System.out.println( 1 + "*" + num1 + "=" + (1 * num1));
        }


        for ( int l  = 1; l <= 6 ; l ++ ){
            System.out.println("java is fine");
        }
        ////


    }
}
