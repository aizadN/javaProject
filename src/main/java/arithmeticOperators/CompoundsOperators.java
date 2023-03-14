package arithmeticOperators;

import java.awt.desktop.OpenURIEvent;

public class CompoundsOperators {
    public static void main(String[] args) {
        int a = 5;
         a ++;   ///a = a +1
       // a ++;

        System.out.println(a);  //6
        // System.out.println(a); //7



        a --;  // a = a - 1

        int age = 18;
        System.out.println( age++ );   //post increment
                System.out.println(age); //19

        int price = 20;
        System.out.println(++price); //pre increment
        System.out.println(price++); //21
        System.out.println(price); //22


        int money = 20;
        money += 3;// money + money +3
        System.out.println(money);  //23

        money +=5;
        System.out.println(money);//28

        money -= 8 ;
        System.out.println(money); //20

        money *=2;
        System.out.println(money);//40

        money /= 4 ;
        System.out.println(money);  //10

        money %= 2;
        System.out.println(money); //0


        //at home
         int apple = 20;
          apple += 3;   //apple +  apple +3
          System.out.println(apple); //23

          apple += 5;
          System.out.println(apple); // 28

          apple-= 8;
        System.out.println( apple); //20

        apple *= 2;
        System.out.println(apple);//40

        apple /= 4;
        System.out.println(apple); //10


        apple %= 2;
        System.out.println(apple); // 0





    }
}
