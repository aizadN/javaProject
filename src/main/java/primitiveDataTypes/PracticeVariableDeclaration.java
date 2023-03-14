package primitiveDataTypes;

import java.awt.*;

public class PracticeVariableDeclaration {

    public static void main (String [] arg){
        byte myByte; //declared variable
        byte _another_byte;

        myByte = 5;
        myByte = 10;
        System.out.println(myByte);  //10

        myByte = 20;
        System.out.println(myByte); //20

        _another_byte = 100;
        System.out.println(_another_byte);


        /*
        create 5 short variables
        assing values, reassing twise
        print them
         */

        short myShort1 = 10;////
        short myShort = 11;
        System.out.println(myShort1);

        short myShort2 = 25;
        System.out.println(myShort2);

        short myExample = 35;
        short myExample1 = 33;
        System.out.println(myExample);

        short myAnswer = 11;
         myAnswer = 13;
        System.out.println(myAnswer);

        short myPrint = 17;
        myPrint = 19;
        System.out.println(myPrint);


        int myInt1 = 11;
        myInt1 = 12;
        System.out.println(myInt1);

        int myInt2 = 19;
        myInt2 = 33;
        System.out.println(myInt2);

        int int1;
        int1 = 2;
        System.out.println(int1);


        int int8 = 99;
        System.out.println(int8);

        int myCoffe = 33;
        myCoffe = 23;
        System.out.println(myCoffe);
        /////////////



        long longNumber = 1;
        longNumber = 2000;

        long  longNumber2 = -2147483648L;
        long  longNumber3 = 2147483648L;

        //longNumber2 = myInt3;// 40
        System.out.println(longNumber2);


        System.out.println(longNumber2);





        byte byteNumber = 10;
        short shortNumber = 2;
        int intNumber = 40;




         longNumber = intNumber;
         longNumber = byteNumber;
         longNumber = shortNumber;
         intNumber =shortNumber;
         intNumber = byteNumber;
         //shortNumber = longNumber;

         ///shortNumber = intNumber; not work


        //Casting is used to store larger variable values into smaller variable values
        intNumber = (int) longNumber;

                byteNumber = (byte) intNumber;
                shortNumber =(byte) longNumber;










//////////

        int myInt4;
        int myInt5;

        myInt4 = 245234;
        myInt4 = 100;

        myInt5= myInt4;
        System.out.println(myInt4);
        System.out.println(myInt5);




        //SINGLE LINE COMMENT
        /*
        this method takes numbers and multiplies
       1.Declare variable(means create variable)
       2.Assing value to variable (put value inside variable)
       3.Reassing value to variable(put new value to the same container)

       VARIABLE DECLARATION
       byte myByte;
       short myShort;
       int myImt;
       long myLong;

       VALUE ASSIGNMENT
       byte myByte = 3; (declare variable and assing value)
       short age; (declaring variable)
       age=40; (assigning value to variable)

       REASSING VALUE
       int number = 100;
       number = 30; (reassing value)
       number = 0;


       NAMING CONVENTION:

      -all variables must start with lower case
      -all variables must use camelCase (thisIsMyCamelCaseLongWorld)
      -all classe must start with upper case,use camelCase
      -all packages must start with lower case, use camelCase
      -names must start with any letter, or _ or $

         */
    }
}
