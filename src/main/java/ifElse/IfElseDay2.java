package ifElse;

public class IfElseDay2 {
    public static void main(String[] args) {
         int day = 3;

         if( day == 1){
             System.out.println("Monday");
         }
             if(day == 2){
                 System.out.println("Tuesday");
             }
         if (day == 3){
             System.out.println("Wendesday");
         }
         if(day == 4){
             System.out.println("thursday");
         }
         if (day == 5) {
             System.out.println("friday" );
         }
         if (day ==6){
             System.out.println("saturday");
         }
         if (day == 7){
             System.out.println("sunday");
         } else {
             System.out.println("invalid");
         }
          //////////////
        if (day == 1 ){
            System.out.println("monday");
        }
         else if (day == 2 ){
            System.out.println("tuesday");
        }
         else if (day == 3){
            System.out.println("wednesday");
        }
         else if (day ==4){
            System.out.println("thuer");
        }


          String dayOff = "Tuesday";

         if ( dayOff.equalsIgnoreCase("Monday")){
             System.out.println(1);
         }
            else if (dayOff.equalsIgnoreCase("tuerday")) {
             System.out.println(2);
         }
         else if (dayOff.equalsIgnoreCase("wednesday")) {
             System.out.println(3);
         }
         else if (dayOff.equalsIgnoreCase("thursday")) {
             System.out.println(4);
         }
         else if (dayOff.equalsIgnoreCase("friday")) {
             System.out.println(5);
         }
         else if (dayOff.equalsIgnoreCase("saturday")) {
             System.out.println(6);
         }
         else if (dayOff.equalsIgnoreCase("sunday")) {
             System.out.println(7);
         }
         else{
             System.out.println(-1);
         }



         byte time = 18;
        if (time >= 9 && time <=17){
            System.out.println("WORK HOURS");
        }
        else if(time >= 7 && time <= 9 || time >= 18 && time <= 19){
            System.out.println("Commute hours");
        }
        else if (time >=6 && time >=8) {
            System.out.println("Breacfast time");
        }
        else if (time >=12 && time >=13){
            System.out.println("Lunch time");
        }
        else if (time >=20 && time <=22){
            System.out.println("Dinner time ");
            if (time == 22){
                System.out.println("late hours");
            }
        }
        else if ( time >= 22 && time <=24){
            System.out.println("Late hours");
        }
    }
}
