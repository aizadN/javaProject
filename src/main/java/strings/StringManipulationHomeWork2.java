package strings;

public class StringManipulationHomeWork2 {
    public static void main(String[] args) {
       //1 Check if a given String ends with a specific substring.
        String  str1 = "Hello Everyone, how are you!";
        System.out.println( str1.indexOf('!'));

       //2 Extract a substring from a given String starting from a specific index.

        System.out.println(str1.indexOf('E'));
        System.out.println(str1.substring(5,14));
        System.out.println(" " + str1.charAt(5) + str1.charAt(6) + str1.charAt(7) + str1.charAt(8) + str1.charAt(9) + str1.charAt(10) +str1.charAt(11) +str1.charAt(12) + str1.charAt(13) + str1.charAt(14));


        //3Replace all occurrences of a specific substring in a given String.
           str1 = str1.replace('e' , ' ');
        System.out.println(str1);

         //4Retrieve the substring between two specific indexes in a given String.
          String sstr1 = "Hello Everyone, how are you!";
        System.out.println(sstr1);
        String str2 = sstr1.substring(5,14);
        System.out.println(str2);


       //5 Find the index of the last character in a given String.
        System.out.println(sstr1.indexOf("!"));

          //6 Check if a given String starts with a specific substring.
        System.out.println( sstr1.indexOf("H"));  //0


        //7 Replace the first occurrence of a specific character in a given String.
 String sstr5 =  sstr1.replace('H','M');
        System.out.println( sstr5);
        System.out.println(sstr5.toLowerCase());

        //8 Retrieve the index of the nth occurrence of a specific character in a given String.



        String bb = "He is in seventh grade";
        bb = bb.replace("nth", "");
        System.out.println(bb);


        ///9 Remove all whitespace characters from a given String.
         String hello = "        Hello Everyone, how are you!";
        System.out.println(hello);
        hello = hello.trim();
        System.out.println(hello);

         // 10 Convert all the characters in a given String to uppercase.
        System.out.println(hello.toUpperCase());

    }
}
