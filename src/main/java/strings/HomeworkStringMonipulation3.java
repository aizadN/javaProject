package strings;

public class HomeworkStringMonipulation3 {
    public static void main(String[] args) {

        String message = "Hello everyone, Let's do Java String exercises";
        //1. write a program that will create a following output: The character at position 10 is y
        System.out.println( "The character at position 10 is: "  + message.charAt(10));

       // 2. print out the length of the String message
        System.out.println(message.length());

       // 3. print out the String message all in uppercase
        System.out.println(message.toUpperCase());
        //4. print out the String message all in lowercase
        System.out.println(message.toLowerCase());

        //5. print only letter #5
        System.out.println(message.charAt(5));  //it is empty spase
       // 6. print only last letter
        System.out.println(message.charAt(45));

        //7. print first letter in lowercase
        System.out.println( message.substring(0,1).toLowerCase());

        // 8. print last letter in uppercase
        System.out.println(message.substring(45,46).toUpperCase());

    }
}
