package methods;

public class StringMethods {
    /*
    create a method  that takes 2 strings and checks if they are same .True or false
     */

    static boolean compareStrings(String str1, String str2){
        if(str1.equals(str2)){
            return true;
        }
        return false;
    }
    /*
create a method which takes 2 strings abd returns one concanatenated string in all upper case
 */

    static  String concatenateStrings(String s1, String s2){
        return  (s1 + s2).toUpperCase();
    }


    /*
    Create a method which takes 2 strings ,concatenate both
    strings and return the lenght of concataneted string

     */
    static int concatenatedString1(  String  str3, String  str4){
        return (str3 +str4 ).length();
    }

    /*
    create method with takes int and returns true if int is even,else return false
     */
    public  static  boolean isEven(int num  ) {
        if (num % 2 == 0) {
            return true;
        }
        return false;
    }
//    public  static  boolean isEven(int num  ) {
//      return num % 2 ==0;
//    }
    /*
    create a method with takes int and return true if integer is divisible by 10,else returns false
     */
        public static boolean isDivisible(int num){
            return  num % 10 == 0;
}

    /*
   create void method , with takes one int and prints out multiplication table of this int
     */

    public static void multiplication( int a) {
     for (int i = 1; i <= 10; i++){
         System.out.println(a + " * " + i + " = " + (a * i));
     }
        }
/*
create a method that takes 2 inrs, and returns the largest one
 */
        public static int getLargest (int a, int b ){
        if (a>b){
            System.out.println(a);
            return a;
        }
            System.out.println(b);
        return b;
        }
        /*
        create a method which takes 4 int,and returns their avarage
         */
    public static int getAverage( int a ,int b, int c, int v){
        return  (a +b + c +v ) /4;
    }

        /*
        create a method with takes one int and returns the sum  all numbers starting from 1 up to that int
         */

    public static int getSum (int a){
        int  sum = 0;
        for (int i = 0 ; i <= a; i ++){
          sum += i;
        }
        return  sum;
    }




    public static void main(String[] args) {
        boolean isSame = compareStrings("hello" , "hellllllooooo");///false
        System.out.println(isSame);

        compareStrings("bye", "sf");
        multiplication(5);
        System.out.println(getSum(5));


    }



}
