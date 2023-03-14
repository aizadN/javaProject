package primitiveDataTypes;

public class PracticeDoubleFloat {
    public  static void main(String[] arg ){
        /*
        float and double are variable that store decimal numbers
        double is larger than float
        double is the must precise variable
        Java thinks that all decimal numbers are double
        to make sure float is float put F/f in the end
        both double float


         */

        double priceOfBread = 4.99;
        double priceOfApples = 3.995555554444444444444444;
        System.out.println(priceOfApples);


        priceOfBread = 3599999999.3921D;
        System.out.println(priceOfBread);


        priceOfBread = 98.1;


        byte byte1 = 2;
        short short1 = 5;
        int int1 = 7;
        long long1 = 345;
        float float1 = 345.54F;
        double double1 = 2343;

        float1 = (float) double1;
         double1 = float1;


         double1 = 4.99;
         long1 = (long) double1;
           System.out.println(long1);


           /////////////////
      //create 10 double,create 10 floatsvalue,
        // assing values,reassing values,
        //do casting
          ///java is bad///
       // 5.66- floating numbers ,fractional, decimal number
       // 1,2,3,- whole numbers
        // 1234567890 -desimal system
       // 012345678 -octol system
       //  0,1 - binary system


       // 89.11155   --89 is desimal,  11155 --is fractinal


        int a = 5;
        double d = 123.999999;
        a = (int) d;
         System.out.println(a); // 123

   short sh;
   float f =  (float)12.7;
   sh = (short)f;
   System.out.println(sh);  //12














    }
}
