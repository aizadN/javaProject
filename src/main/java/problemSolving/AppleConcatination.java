package problemSolving;

import java.util.Scanner;

public class AppleConcatination {
    public static void main(String[] args) {
        //AppleBanana
//APPLE banana banana APPLE
//PPLE BNN (remove all a's and print all in uppercase)
//ApBa
//LeNa
//AB
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word");
        String str1= scanner.nextLine();
        String str2 = scanner.nextLine();

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        System.out.println(str1.toUpperCase()+str2 +str2 + str2.toUpperCase() );
        System.out.println(str1+str2.replace('a', 's') );
       // str1=str1.toUpperCase();
        //str2=str2.toUpperCase();
        System.out.println( str1.substring(str1.length() -2) + str2.substring(str2.length()));
        System.out.println(str1 .toUpperCase().charAt(str1.length()-2) + "" + str2.toUpperCase().charAt(str2.length() -1));
    }
}
