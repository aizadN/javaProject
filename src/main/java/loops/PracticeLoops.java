package loops;

public class PracticeLoops {
    public static void main(String[] args) {

        for (int x = 10;  x >=1; x--){
            System.out.println("The value of x is:" + x); ///10,9,8,7,6,5,4,3,2,1
        }
        ////
//        for (int i =0 ; i <=10; i = i +2){
//            System.out.println(i); //////0,2,4,6,8,10
//        }
        ///

        for( int y =10 ; y >=0 ; y = y -=2 ){
            System.out.println("The value of y is:  " + y); // 10,8,6,4,2,0
        }
        ////
        for( int r = 1 ; r >=15 ; r  += 2 ){
            System.out.println("The value of y is:  " + r);
        }

        /////
        int sum = 0;
        for (int i = 1; i <= 10 ; i ++ ){
            System.out.println("The value of i is: " + i);
            sum = sum +i;
        }
        System.out.println("The result is " + sum);


         int sum1 = 0;
        for(int m = 0; m <= 100; m = m +2 ){
            System.out.println("The value of num is :"+ m);
            sum1 = sum1 +m;
        }
        System.out.println("The value of num is:" + sum1);

    }



}
