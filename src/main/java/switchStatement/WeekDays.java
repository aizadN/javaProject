package switchStatement;

import javax.swing.text.DefaultEditorKit;
import java.util.Scanner;

public class WeekDays {
    public static void main(String[] args) {
        //int days = 5;
//         switch (days){
//             case 1 :
//                 System.out.println("Monday");
//                 break;
//             case 2 :
//                 System.out.println("Tuersday");
//                 break;
//             case 3 :
//                 System.out.println("Wednesday");
//                 break;
//             case 4:
//                 System.out.println("Thursday");
//                 break;
//             case 5:
//                 System.out.println("Friday");
//                 break;
//             case 6:
//                 System.out.println("Saturday");
//                 break;
//             case 7 :
//                 System.out.println("Sunday");
//                 break;
//             default:
//                 System.out.println("Invalid day");
//                 break;
//
//         }

//            switch (days){
//                case 1:
//                case 2:
//                case 3:
//                case 4:
//                case 5:
//                    System.out.println("Weekdays");
//                    break;
//                case 6:
//                case 7:
//                    System.out.println("Weekends");
//                    break;
//                default:
//                    System.out.println("Invalid day");
//            }

//        switch (days) {
//            case 1, 2, 3, 4, 5:
//                System.out.println("Weekday");
//                break;
//            case 6, 7:
//                System.out.println("Weekend");
//                break;
//            default:
//                System.out.println("INvalid day");
//                break;
//        }

//         char letter = 'A';
//         switch (letter){
//             case 'A', 'E', 'I','O','U':
//                 System.out.println("Vowels");
//                 break;
//             case 'D':
//                 System.out.println("Consonant");
//                 break;
//             default:
//                 System.out.println("It is not case- sensitive");
//         }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a grade");

         String letter = sc.nextLine();

         switch (letter){
             case "A":
                 System.out.println("Good job");
                 break;

             case "B":
                 System.out.println("Good day");
                 break;

             case "C":
                 System.out.println("Not bad");
                 break;

             case "D":
                 System.out.println("Nice");
                 break;

             case "F":
                 System.out.println(" Morning");
                 break;
             default:
                 System.out.println("does not exist");
                 break;

         }



    }
}