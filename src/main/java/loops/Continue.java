package loops;

import java.util.Scanner;

public class Continue {
    public static void main(String[] args) {

//        for (int i = 1; i <= 10; i++) {
//
//            if (i == 5) {
//                continue;
//            }
//            System.out.println(i);
//        }


        for (int o = 1; o <= 100; o++) {
            if (o % 2 == 0) {
                continue;
            }
            System.out.println(o);
        }

        for (int m = 1; m <= 100; m++) {
            if (m / 3 == 0) {
                continue;
            }
            System.out.println(m);
        }


        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 2 numbers");
        int negative = scanner.nextInt();
        int positive = scanner.nextInt();

        for (int i = negative; i <= positive; i++){

            if  (i < 0 && i % 2 == 0) {
                continue;
            }
                 else if (i > 0 && i % 2 != 0) {

                  continue;
                }

            System.out.println(i);
            }


        }
    }

