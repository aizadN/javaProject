package loops;

public class NestedLoops {
    public static void main(String[] args) {
        /*
        nesded loop - loop inside loop
         */
        //dubugger point

       for(int i = 1; i <=50; i ++){
           for(int k = 1 ; k <=50; k++){
               System.out.print((i * k) + "\t\t\t" );
           }
           System.out.println();
       }

       ///

        for( int a = 1; a <=10 ; a++){
            for (int b = 1 ; b <=a ; b++){
                System.out.print("*" + "\t");
            }
            System.out.println();
        }

     for (int m = 1 ; m <=10 ; m ++){
         for(int n = 10; n >m  ; n --){
             System.out.print( " ");
         }
        for (int k = 1; k<=m ;k ++){
            System.out.print("*");
        }
        for (int l =10; l <= 1; l++){
            for(int h=1; h<+10; h++){
                System.out.print(" ");
            }
        }
         System.out.println();
     }

     ////////////////////

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++)
                System.out.print(" ");
            for (int k = 0; k < (2 * i + 1); k++)
                System.out.print("*");
            System.out.println();//////////elochka
        }

    }
}
