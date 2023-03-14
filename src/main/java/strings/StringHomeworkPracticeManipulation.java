package strings;

import java.sql.SQLOutput;

public class StringHomeworkPracticeManipulation {
    public static void main(String[] args) {
        ////1/Write a program that prints out the index of the first occurrence of the word "world"
        // in the string "Hello world" using the indexOf method.

        String a = "Hello world";
        int index = a.indexOf("world");
        System.out.println(index);  //6


        //2 Write a program that prints the first letter of the string "Hello" using the charAt method.
        System.out.println(a.charAt(0)); //H

        // 3 Write a program that prints the string "HELLO" in all lowercase using the toLowerCase method.
        String b = "HELLO";
        System.out.println(b.toLowerCase());//hello
///4 Write a program that prints the string "hello" in all uppercase using the toUpperCase method.
        System.out.println(b.toUpperCase());//HELLO
///  5 Write a program that checks if the strings "hello" and "Hello" are equal or not using the equals method.

        String c = "hello";
        System.out.println(c.equals(b));  ///false
        System.out.println(!c.equals(b)); //true
        System.out.println(c == b); ///false another way
        System.out.println(c.equalsIgnoreCase(b)); //// true


        //6 Write a program that prints a new string with the first letter of each word in the string "the quick brown fox"
        // capitalized using , toUpperCase, and toLowerCase methods.

         String ppp = "the quick brown fox";
        System.out.println(ppp.substring(0,1) .toUpperCase());
        System.out.println(ppp.substring(3,5) .toUpperCase());
        System.out.println(ppp.substring(10,11) .toUpperCase());
        System.out.println(ppp.substring(16,17) .toUpperCase());
        String mmm = (ppp.charAt(0) + "" + ppp.charAt(4) + ppp.charAt(10) + ppp.charAt(16));
        System.out.println(mmm);
        System.out.println(mmm.toUpperCase());
        System.out.println(mmm.toLowerCase());






        // !!!!!!!  7   Write a program that prints the string
        // "Hello" in reverse order using the charAt method.
        String n = "Hello";
        String reversedString = "";
        for (int i = n.length() - 1; i >= 0; i--) {

            reversedString = reversedString + n.charAt(i);
        }
        System.out.println("The reversed string of the '" + n + "'is ");
        System.out.println(reversedString);  ///////olleh

        System.out.println( n.charAt(4) + "" + n.charAt(3) + n.charAt(2) +n.charAt(1) + n.charAt(0));

        ////8 Write a program that counts the number of vowels in the string "Hello World"
        // using the charAt and toLowerCase methods.

       String hello9 = "Hello World";
        int counter  = 0;
        String str = hello9.toLowerCase();

         if(str.charAt(0) == 'a' || str.charAt(0) == 'o' || str.charAt(0) == 'i' || str.charAt(0) == 'e'  ){
            counter++;
         }
        if(str.charAt(1) == 'a' || str.charAt(1) == 'o' || str.charAt(1) == 'i' || str.charAt(1) == 'e'){
            counter++;
        }
        if(str.charAt(2) == 'a' || str.charAt(2) == 'o' || str.charAt(2) == 'i' || str.charAt(2) == 'e'){
            counter++;
        }
        if(str.charAt(3) == 'a' || str.charAt(3) == 'o' || str.charAt(3) == 'i' || str.charAt(3) == 'e'){
            counter++;
        }
        if(str.charAt(4) == 'a' || str.charAt(4) == 'o' || str.charAt(4) == 'i' || str.charAt(4) == 'e'){
            counter++;
        }
        if(str.charAt(5) == 'a' || str.charAt(5) == 'o' || str.charAt(5) == 'i' || str.charAt(5) == 'e'){
            counter++;
        }
        if(str.charAt(6) == 'a' || str.charAt(6) == 'o' || str.charAt(6) == 'i' || str.charAt(6) == 'e'){
            counter++;
        }
        if(str.charAt(7) == 'a' || str.charAt(7) == 'o' || str.charAt(7) == 'i' || str.charAt(7) == 'e'){
            counter++;
        }
        if(str.charAt(8) == 'a' || str.charAt(8) == 'o' || str.charAt(8) == 'i' || str.charAt(8) == 'e'){
            counter++;
        }
        if(str.charAt(9) == 'a' || str.charAt(9) == 'o' || str.charAt(9) == 'i' || str.charAt(9) == 'e'){
            counter++;
        }

        if(str.charAt(10) == 'a' || str.charAt(10) == 'o' || str.charAt(10) == 'i' || str.charAt(10) == 'e'){
            counter++;
        }
        System.out.println("Counter of vowels -> " + counter);








       //  9 Write a program that concatenates the strings "Hello" and "World"
        // using the concat method and prints the resulting string.

String l = "Hello";
String m = "World";
String  i =  l.concat(m);
        System.out.println(i);/// HelloWorld


        // 10 Write a program that checks if the strings "hello" and "HELLO"
        // are equal ignoring case using the equalsIgnoreCase method.

        System.out.println(n.equalsIgnoreCase(n));  // true

       //11 Write a program that prints the length of the string "Hello World" using the length method.
        System.out.println(a.length());  //11


        //12 Write a program that prints the third character of the string "Hello" using the charAt method.
        System.out.println(l.charAt(3));  ///l



        // 13 Write a program that prints out the index of the first occurrence of the letter "l"
        // in the string "Hello World"
        ///using the indexOf method.
        int  index9 = a.indexOf("l");
        System.out.println(index9);



       //14  Write a program that checks if the string "hello" and "hello"
        // are equal using both the == and equals methods.
        String ll = "hello";
        String kk = "hello";
        System.out.println(ll == kk);  //true
        System.out.println(ll.equals(kk)); //true

        //15
        //Write a program that checks if the string "hello" and "HELLO" are equal
        //using both the == and equals methods.
      String mm = "HELLO";
       String bb= "hello";
        System.out.println(mm == bb);//false
        System.out.println(mm.equals(bb)); //false
        System.out.println(!mm.equals(bb));//true


       //16 Write a program that prints the string "HELLO WORLD" in all lowercase using the toLowerCase method.

    String lo = "HELLO WORLD";
        System.out.println(lo.toLowerCase()); //hello world


       //17 Write a program that prints the string "hello world" in all uppercase using the toUpperCase method.
        String bo = "hello world";
        System.out.println(bo.toUpperCase()); //HELLO WORLD

        // 18 Write a program that replaces all occurrences of the letter "l" with
          //the letter "r" in the string "Hello World" using the replace method.

        String hello = "Hello World";
        hello = hello.replace("l" , "r");
        System.out.println(hello);
        hello = hello.replace("o" , "l");
        System.out.println(hello);












            }
        }


