package arithmeticOperators;

public class HomeworkOperatorsPractice2 {
    public static void main(String[] args) {

        //task  #1
        int a = 100;
        int b = 200;
        int result = (a + b);
        System.out.println( a + " + " + b + " = " + result );

      // task #2
        int q = 5;
        int w = 9;
        int e = 10;
        int result1 = (q + w + e);
        System.out.println(q + " + " + w + " + " + e + " = " + result1);

        //task #3

         int a1 = 1;
         int a2 = 2;
         int a3 =3;
         int a4 = 4;
         int a5 = 7;
         int a6 = 8;
         int a7 = 10;
         System.out.println(a1 + " + " + a2 + " = "  + (a1 + a2));
         System.out.println(a3 + " - " + a1 + " = " + (a3 - a1));
         System.out.println(a2 + " * " + a2 + " = " + (a2 * a2));
         System.out.println(a4 + " / " + a2 + " = " + (a4 / a2));
         System.out.println(a2 + " + "  + a6 + " = " + (a2 + a6));
         System.out.println(a7 + " % " + a5 + " = " + (a7 % a5));



         //task 4

        int length = 9;
        int width = 15;
         int  perimeter = 2* (length+width);
         int area = (length * width);

         System.out.println(perimeter); // the perimeter is 48
         System.out.println(area);  //the area is 135

        System.out.println("area is " + (9*15) + "  "  +"perimeter is " + (2* (9+15)));   // just another way

         //task 5
        int c = 8;
        int d = 2345;
        int s = 3;
        int f = 5;
        int h = 5;
         int c1 = c+d;
         int d1 = c1/s;
         int s1 = d1%f;
         System.out.println(c1);
         System.out.println(d1);
         System.out.println(s1);
         System.out.println("((8+2345)/3) % 5= " +s1);


//     task6

        int apple  = 25;
        apple += 4;  //apple = apple + 4
        System.out.println(apple); //29

         apple -= 5; //apple= apple -5
         System.out.println(apple);//24

        apple *= 3; //apple = apple *3
        System.out.println(apple); //72


        //task7

        byte byte1 = 23;
        byte byte2 = 45;
        System.out.println(byte1 == byte2);// false
        System.out.println(23==45);  //false

     // task 8
        byte byte3 = -10;
        byte byte4 = 10;
        System.out.println( byte3== byte4);  //false
        System.out.println( -10==10);  //false




    }
}
