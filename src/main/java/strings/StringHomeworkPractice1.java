package strings;

import java.util.Locale;

public class StringHomeworkPractice1 {
    public static void main(String[] args) {


        String hello1 = "Hello World!";
        String hello2 = "Hello world!";
        String hello3 = new String("HelloWorld");
        System.out.println( !hello1.equals(hello2));   //true
        System.out.println(hello1 == hello3); ///false
        System.out.println( hello1 == hello2);  //false
        System.out.println(hello1.toLowerCase());
        System.out.println(hello1.toLowerCase().equals(hello2));
        System.out.println(hello1.toUpperCase() == hello3); //false
        System.out.println(hello1.equals(hello3.toUpperCase()));  //  just another way to show false









        ///////////
        String s = "Java"+1+2+"Quiz"+""+(3+4);
        System.out.println(s);

        //////////////
        String ss = new String("java");
        String sss = new String("JAVA");
        sss = ss.toLowerCase();
        System.out.println(ss = sss);

        String t = "Java String Quiz";
        System.out.println(t.charAt(t.toUpperCase().length()-1));

///////////////
        String s1 = "Cat";
        String s2 = "Cat";
        String s3 = new String("Cat");
        System.out.print(s1 == s2);
        System.out.print(s1 == s3);

/////////////

        String s11 = "abc";
        String s22 = "abc";
        System.out.println("s1 == s2 is:" + s1 == s2);



    }
}
