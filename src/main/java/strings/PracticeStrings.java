package strings;

import java.sql.SQLOutput;

public class PracticeStrings {
    public static void main(String[] args) {
         String singerName = "Michael Jackson";
        System.out.println(singerName.length()); //return number of chars
        System.out.println(singerName.endsWith("on")); //return true
        System.out.println(singerName.endsWith("On")); // false
        System.out.println(singerName.startsWith("Misha")); //false
        System.out.println(singerName.isEmpty());//false
        System.out.println(!singerName.isEmpty()); //true
        System.out.println(singerName.toLowerCase());  // michael jackson
        System.out.println(singerName); ///Michael Jackson


        singerName = singerName.toUpperCase();
        System.out.println(singerName);  // //MICHAEL JACKSON


        System.out.println(singerName.charAt(0)); //M
        System.out.println( "" + singerName.charAt(0) + "" + singerName.charAt(3));  // MH
        System.out.println(singerName.charAt(8));  //j
        System.out.println(singerName.indexOf("c"));
        System.out.println(singerName.indexOf("C" , 3) );
        System.out.println(singerName.indexOf("W")); //-1
        //System.out.println(singerName.charAt(2352));  //bounds error


        String  singerName2 = "Justin Bieber";
        boolean areTheySame = singerName2.equals(singerName);  //false
        System.out.println(areTheySame);
        System.out.println(!singerName.equals(singerName2));  //true
        System.out.println(singerName.equals(singerName2)); //false

        singerName = singerName2; //Jastin Bieber
        System.out.println(singerName.equals(singerName2));  //true
        System.out.println(singerName ==singerName2); //true






    }
}
