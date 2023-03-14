package loops;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        int i = 1;
        while(i <=10){
            System.out.println(i); //12345678910
            i++;
        }
//        for(int  q = 2; q <=20; q++){
////            if (q % 2 == 0){
////                System.out.println(q);
////            }
////        }
        int q = 1;
        while (q <= 100){

            if(q % 2 == 0){
                System.out.println(q); //2,4,6,8,10 i t d

            }
            q++;
        }

       int  n = 1;
        while (n <= 10){
            System.out.println("Good morning everyone");
            n++;
        }

        for (int r = 1; n <= 10; r ++){
            System.out.println("Good morning everyone");
        }
///////
        for (int o = 100; o >= 1; o--) { //more than
            System.out.println(o);
        }

        int m =100;
        while (m >=1){
            System.out.println(m);
            m--;
        }
        ///////


        int y = 1;
        while (y <= 31){
            System.out.println( y +" January  2023");
            y++;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        boolean isPrime =true;
        int j = 2;
        while (j < number){
            if(number % j == 0 ){
                isPrime = false;
            }
            j++;
        }
        if (isPrime){
            System.out.println("Number is prime");
        }else {
            System.out.println("Not prime");
        }
    }
}
