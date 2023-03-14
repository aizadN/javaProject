package problemSolving;

import java.util.Scanner;

public class EasyEmpty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String world = sc.next();


        if (world.isEmpty() ){
            System.out.println("Empty");
        }else{
            System.out.println("not empty");
        }


    }
}
