package objects;

import strings.StringReplace;

public class Car {
     String model;
     String year;
     String price;
     String color;

     public  void drive(){
          System.out.println( model + " is driving");

     }
     public void stop(){
          System.out.println( model + " stops");
     }
     public void playMusic(){
          System.out.println(model + " is playing music");
     }

     public static void main(String[] args) {
           Car car1 = new Car();
           car1.model = "Toyota";
           car1.year = "2013";
           car1.price = "1234$";
           car1.color = "white";


           Car car2 = new Car ();
           car2.model = "Lexus";
           car2.year = "2022";
           car2.price = "34466$";
           car2.color = "purple";


           car1.drive();
           car2.drive();

           car1.stop();
           car2.stop();

           car1.playMusic();
           car2.playMusic();
     }
}
