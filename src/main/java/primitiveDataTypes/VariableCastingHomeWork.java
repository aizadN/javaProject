package primitiveDataTypes;

public class VariableCastingHomeWork {

    public static void main(String[] args) {



        //REASSING VALUE

        int  number = 670;
        number = 40;
        number = 0;

        System.out.println(number);


        byte myBob = 125;
        short age = 67;



        System.out.println(myBob);
        System.out.println(age);




        short my;
        float f =  (float)11.4;
        my = (short) f;
        System.out.println(my);


        int b = 345678567;
        float c =  (float)556666;
        b =  (int)c;
        System.out.println(b);
        System.out.println(c);




        int y = 9;
        double m = 120.99999;
        y = (int)  m;
        System.out.println(y);


        byte hisByte = 15;
        double her = 2466.99;
        hisByte = (byte) her;
        System.out.println(her);




        float apple = 45;
        double banana = 4566.9999;
        apple = (float) banana;

        System.out.println(apple);

        short apple1 = 677;
        double banana1 = 68799.88;
        apple1 = (short) banana1;
        System.out.println(banana1);
        //System.out.println(apple1);





        short his;
        float h =  (float)10.6;
        his =  (short) h;
        System.out.println(h);
        System.out.println(his);

        ///////

        byte byte1 = 1;
        short short1 = 2;
        int int1 = 250;
        long long1 = 30;
        float float1 = 50.565666F;
        double double1 = 111.889999;

        short1 = byte1;
        System.out.println(short1);
        int1 = byte1;
        System.out.println(int1);
        byte1 = (byte)long1;
        System.out.println(byte1);

        byte1 =  (byte)short1; //
        System.out.println(byte1); //
        byte1 = (byte) short1;
        System.out.println(byte1); //
        byte1 = (byte) int1;
        System.out.println(byte1);///
        byte1 = (byte) long1;
        System.out.println(byte1); //30
        byte1 = (byte) float1;
        System.out.println(byte1);//50
        byte1 = (byte) double1;
        System.out.println(byte1);



        short1 = (short)int1;
        System.out.println(short1); //1
        short1 = (short)  int1;
        System.out.println(short1);//1
        short1 = (short)  long1;
        System.out.println(short1);//30
        short1 = (short) float1;
        System.out.println(short1);//50
        short1 = (short) double1;
        System.out.println(short1); //111


        int1 = byte1;
        System.out.println(int1);
        int1 = short1;
        System.out.println(int1); //111
        int1 = (int) long1; //111
        System.out.println(int1);  //30
        int1 =  (int) float1;
        System.out.println(int1); //50
        int1 =  (int)double1;
        System.out.println(int1); ///111


    byte byte2 = 77;
    short short2 = 565;
    int int2 = 5667;
    long long2 = 4568;
    float float2 = 34.78F;
    double double2 = 234.45555544;

     long2 = byte2;
     System.out.println(long2); //5667
         long2 =  short2;
        System.out.println(long2);
     long2 = int2;
     System.out.println(long2);
     long2 = long2;
     System.out.println(long2);
     long2 =  (long)float2;
     System.out.println(long2);
     long2 = (long) double2;
     System.out.println(long2);

     float2 = byte2;
     System.out.println(float2);
     float2 = long2;
     System.out.println(float2);
     float2 = float2;
     System.out.println(float2);
     float2 = (float) double2;
     System.out.println(float2);

     double2 = byte2;
     System.out.println(double2);
     double2 = short2;
     System.out.println(double2);
     double2 = long2;
     System.out.println(double2);
     double2 = float2;
     System.out.println(double2);
     double2 = double2;
     System.out.println(double2);






















    }
}
