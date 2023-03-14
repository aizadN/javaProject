package scannerClass;

import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {

        /*
       1 If the temperature is below 0 degrees Celsius,
       the application should output "It's freezing outside!
        Wear a heavy coat, gloves, and a hat."
       2 If the temperature is between 0 and 10 degrees Celsius (inclusive) and it is raining,
 the application should output "It's chilly and rainy! Wear a raincoat, boots, and a scarf."
      3  If the temperature is between 0 and 10 degrees Celsius (inclusive) and it is not raining,
 the application should output "It's chilly outside! Wear a jacket, gloves, and a hat."
      4 If the temperature is between 11 and 20 degrees Celsius (inclusive) and it is raining,
the application should output "It's cool and rainy! Wear a light jacket, boots, and a scarf."
     5 If the temperature is between 11 and 20 degrees Celsius (inclusive) and it is not raining,
     the application should output "It's cool outside! Wear a light jacket and comfortable shoes."
     6 If the temperature is above 20 degrees Celsius and it is raining,
     the application should output "It's warm and rainy! Wear a light jacket, shorts, and sandals."
    7 If the temperature is above 20 degrees Celsius and it is not raining,
    the application should output "It's warm outside! Wear a t-shirt, shorts, and comfortable shoes."
         */

        Scanner sc = new Scanner(System.in);
        System.out.println(" enter temperature: ");
        double temp = sc.nextDouble();

        System.out.println("Is it raining ? true/ false");
        boolean isRaining = sc.nextBoolean();

        if (temp <0){
            System.out.println("It is freezing outside ! wear a heavy coat");
        }
        else if( isRaining && temp >= 0 && temp <= 10){
            System.out.println("Wear a raincoat, boots, and a scarf. ");
        }
        else if( isRaining && temp >= 0 && temp <= 10){
            System.out.println("It's chilly outside! Wear a jacket, gloves, and a hat.");
        }
        else if( isRaining && temp >= 11 && temp < 20){
            System.out.println("It's cool and rainy! Wear a light jacket, boots, and a scarf.");
        }
        else if( isRaining && temp >= 11 && temp < 20){
            System.out.println("It's cool outside! Wear a light jacket and comfortable shoes.");
        }
        else if( isRaining && temp >= 20){
            System.out.println("IIt's warm and rainy! Wear a light jacket, shorts, and sandals.");
        }
        else if( isRaining && temp >= 20){
            System.out.println("It's warm outside! Wear a t-shirt, shorts, and comfortable shoes.");
        }

    }
}
