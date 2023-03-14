package arithmeticOperators;

public class IntroToOperators {

    public static void main(String[] args){
        int a = 10;
        int b = 5;
        int c = a+b;
        System.out.println(c); // 15

        c = a - b;
        System.out.println( c);//5

        c = a +a +a; // 10+10+10
        System.out.println(c); //30

        a = c - b;
        System.out.println(a); //25

        a = 100;
        b = 25;
        c = 10;
        System.out.println(a/b); //4
        System.out.println(a + "/" + b + "=" +  a/b); // 100/25=4
        System.out.println(a +"/" +c + " =" + a/c); //  100/10 = 10

        System.out.println( b + "*" + c + "  = " + b*c ) ; //25*10 =250
        System.out.println(  a +"+" + b + "-" + c + "=" +  (a+b-c)); // 100+25-10=115


        int num1 = 20;
        int num2 = 5;
        int num3 = 10;
         int result = (num1 + num2) + num3; //
  System.out.println( result);




    }
}
