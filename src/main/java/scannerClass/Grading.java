package scannerClass;

import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        //int grade = 0 to 100

        //if grade is between 0 and 20
        //print "bad, study everything again!"

        //if grade is between 21 and 40
        //print "ok, study more"

        //if grade is between 41 and 60
        //print "good, study more"

        //if grade is between 61 and 80
        //print "very good, keep up"

        //if grade is between 81 and 95
        //print "perfect, good job"

        //if grade is between 96 and 100
        //print "exceptional, proud of you"

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter number  from 0 to 100  ");
           int grade = sc.nextInt();

        System.out.println();
     if( grade >= 0 & grade <= 20){
         System.out.println("bad, study everything again!");
     }
     else if (grade >=21 && grade <= 40 ){
         System.out.println("ok, study more");
     }
     else if (grade >=41 & grade <= 60 ){
         System.out.println("good, study more");
     }
     else if (grade >=61 & grade <= 80 ){
         System.out.println("very good, keep up");
     }

     else if (grade >=96 & grade <= 100 ){
         System.out.println("exceptional, proud of you");
     }
     else {
         System.out.println("enter number from 0 to 100");
     }
    }
}
