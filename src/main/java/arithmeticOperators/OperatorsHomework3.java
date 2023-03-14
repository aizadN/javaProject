package arithmeticOperators;

import javax.swing.plaf.BorderUIResource;
import java.lang.Math;

public class OperatorsHomework3 {
    public static void main(String[] args) {

        int a = 7;
        int b = 12;
        int c = a + b;
        System.out.println(c);  //19

        int a1 = 15;
        int b1 = 8;
        int c1 = a1 - b1;
        System.out.println(c1); //7


        int a2 = 3;
        int b2 = 5;
        int c2 = 7;
        System.out.println(a2 * b2 * c2);  //105


        int a3 = 20;
        int b3 = 5;
        System.out.println(a3 / b3); //4


        int a4 = 27;
        int b4 = 4;
        System.out.println(a4 % b4);  //3

        int a5 = 2;
        int b5 = 5;
        double c4 = Math.pow(2, 5);
        System.out.println(c4);  //32



        int a6 = 10;
        int b6 = 15;
        int c6 = 20;
        int sum = a6 + b6 + c6;
        int average = sum / 3;

        System.out.println(sum);
        System.out.println(average); //15


        int lenght = 5;
        int width = 8;
        int area = lenght * width;
        System.out.println(area);  //40

        int lenght3 = 6;
        int perimeter = lenght3 * 4;
        System.out.println(perimeter);


    }
}
