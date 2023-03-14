package ifElse;

public class PracticeOrOperator {
    public static void main(String[] args) {
        String  menu = "pizza lagman tea bread cake coffe water";
        /*
        if menu has pizza and soda ==> print pizza and soda

         */
        if (menu.contains("pizza ") &&  menu.contains("soda")){
            System.out.println("order pizza and soda ");
        }
         if (menu.contains("tea" )&&  menu.contains("cake")){
            System.out.println("order dessert");
        }
         if (menu.contains("lagman") && menu.contains("tea")){
             System.out.println("order lagman and tea, asian is here");
         }
         if (menu.contains("coffe") || menu.contains("smoothie")){
             System.out.println("breacfast time");

         }
         if (menu.contains("pizza") || menu.contains("pasta")){
             System.out.println("italian day");
         }
         if (menu.contains("tea") && menu.contains("coffe") && menu.contains("water") && menu.contains("soda")){
             System.out.println("bring only drinks");
         }
         if (menu.contains("lagman")  && !menu.contains("plov")){
             System.out.println("not uzbek restaraunt");
         }
    }
}
