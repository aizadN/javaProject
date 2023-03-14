package strings;

public class StringManipulationHomeWork1 {
    public static void main(String[] args) {

       // 1. Check if a given String contains a specific character:
        String str1 = "Hello,Universe";
        char ch = 'o';
        System.out.println(str1.indexOf(ch));


        // 2 Extract a substring from a given String:

        String str2 = "Hello, World!";
        int start = 7;
        int end = 12;
        System.out.println(str2.substring(start)); ///      World!
        System.out.println(str2.substring(end));//// !
        System.out.println(str2.substring(start,end));  //World

        //3. Using charAt() method extract letter 'W'

        String str3 = "Good morning World";
        System.out.println(str3.charAt(13));

        //4. Remove extra white spaces from both ends

        String str4 = "         I love coding     ";
        System.out.println(str4);
        str4 = str4.trim( );
        System.out.println(str4);


       ///5. Remove all occurrences of letter 'o' in the below String
        String str5 = " Learn as if you will live forever, live like you will die tomorrow.";

        System.out.println(str5.replace('o' ,' '));
        System.out.println(str5);




    }
}
