package scannerClass;

import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("");


        int num1 = user.nextInt();
        if (num1 >= 1 && num1 <= 10) {
            System.out.println("valid input");
        } else {
            System.out.println("invalid input");
        }


        Scanner user1 = new Scanner(System.in);
        System.out.println( "Enter month");
          String month = user1.next();

          if (month.equalsIgnoreCase( "january")  || month.equalsIgnoreCase("february")
                  || month.equalsIgnoreCase("desember") ){
              System.out.println(" winter");
          }
        else if (month.equalsIgnoreCase("march")  || month.equalsIgnoreCase("april ")
                  || month.equalsIgnoreCase("May") ){
            System.out.println("Spring");
        }
        else if (month.equalsIgnoreCase("july ")  || month.equalsIgnoreCase("june" )
                  || month.equalsIgnoreCase("August")){
              System.out.println("Summer");
          }
        else if (month.equalsIgnoreCase("September")  || month.equalsIgnoreCase("October")
                  || month.equalsIgnoreCase("November")) {
              System.out.println("Autumn");
          }
        else{
              System.out.println("invalid input");
          }





    }
}
