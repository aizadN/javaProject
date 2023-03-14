package objects;

import java.awt.*;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        rectangle1.height = 10;
        rectangle1.width = 5;
        rectangle1.color = "red";


        System.out.println(rectangle1.width);

        rectangle1.calculateArea();



        Rectangle rectangle2 =new Rectangle();
        rectangle2.width = 17;
        rectangle2.height = 25;
        rectangle2.color = "yellow";
        rectangle2.calculateArea();
        rectangle2.calculateArea();

    }
}
