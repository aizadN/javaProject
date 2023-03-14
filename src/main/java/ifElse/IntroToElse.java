package ifElse;

public class IntroToElse {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        System.out.println("I will compare a and b below ");
        if (a > b ){
            System.out.println(" a is more then b ");
        } else{
            System.out.println("a is less then b ");  ///empty becouse if ===is true
        }
        System.out.println("i already compared a and b");



        int aa = 10;
        int bb = 5;
        System.out.println("I will compare a and b below ");
        if (a == b ){
            System.out.println(" a is more then b ");
        } else{
            System.out.println("the earth is large then sun");  ///empty becouse if ===is true
        }
        System.out.println("i already compared a and b");


        int number1 = 100;
        int number2 = 50;
        if(number1/number2 ==2){
            System.out.println("YES, two!");
        } else{
            System.out.println("NOT two!");
        }

        int number4 = 10;
        int number3 = 50;
        if(number4/number3 ==2){
            System.out.println("YES, two!");
        } else{
            System.out.println("NOT two!");
        }


        String elon = "Tesla SpaceX Paypal Twitter ";
        if (elon.contains("Paypal")){
            System.out.println("Elon owned Paypal");
        }else{
            System.out.println("Elon did not own Paypal");
        }

        /*
        create 5 if else statements
        2 bollean with numbers
        2 boleen with strings
         */

        String green = "Apple,Grapes, Pineapple, Cucumber";
         if (green.contains("Cucumber")){
             System.out.println("Green includs Cucumber");
         }else{
             System.out.println("Green did not include ggg");
         }

          int hello1 = 6;
         int hello2 = 16;
         if(hello1+hello2 ==8){
             System.out.println(" number hello less then  number hello2");
         }else{
             System.out.println("Number hello is more bigger then  apple");
         }

        int hello4 = 1;
        int hello3 = 19;
        if(hello1+hello2 ==20){
            System.out.println(" number hello less then  number hello2");
        }else{
            System.out.println("Number hello is more bigger then  apple");
        }


    }
}
