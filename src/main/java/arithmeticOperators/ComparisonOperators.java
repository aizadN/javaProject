package arithmeticOperators;

public class ComparisonOperators {
    public static void main(String[] args) {
        /*
        Comparison operators are used to compare 2 values
        >  more than
        < less than
        >= more or equal
        <= less or equal
        == equal
        != not equal
         */

        byte potato = 5;
        byte fries = 10;
        // System.out.println(potato > fries) ; //false
       // System.out.println(potato < fries); //true
       // System.out.println(potato >= fries); //false
        //System.out.println(potato <= fries); //true
        //System.out.println(potato == fries);// false
        //System.out.println(potato != fries); //true




        byte cherry = 10;
        byte strawberry = 2;
        System.out.println(cherry > strawberry);  //true
         System.out.println(cherry < strawberry);  //false
        System.out.println(cherry >= strawberry); //true
        System.out.println(cherry <= strawberry); //false
        System.out.println( cherry == strawberry); //false
        System.out.println( cherry != strawberry);  //true

        boolean b = cherry> strawberry;
        System.out.println(b);     //true


         short isShort = 9;
         short isShort1 = 4;

         int hisInt = 128;
         int hisInt2 = 4;


         long myLong  =24;
         long myLong2 = 2;


         System.out.println(1 + 2); //3
        System.out.println(1 + 2 +"hello"); //3hello
        System.out.println("hello" + 1 +2); //hello13
        System.out.println("hello" +  (1 + 2)); //hello3
        System.out.println("hello" +3 + false);  //hello3 true
        System.out.println("hello" +3 + false);  //hello 3 falcee
        System.out.println((1+2 == 3) + "hello" + 4 *5); //truehello20





    }
}
