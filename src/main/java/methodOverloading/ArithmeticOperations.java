package methodOverloading;

public class ArithmeticOperations {



    /*

     */
    public int sumOfNumbers( int a, int b){
        return a + b;
    }
    public int sumOfNumbers( int a, int b, int c){
        return a + b + c;
    }


    public int getAverage(int a, int b , int c , int d){
        return ( (a + b + c + d ) / 2);
    }

    public int getAverage(int a, int b , int c , int d ,int f, int s){
        return ( (a + b + c + d  + f + s) / 2);
    }

//create 2 getAreaOfTriangle methods
//1. int base, int height
//(1/2 * base * height)
//
//2. int a, int b, int c
//
//int s = (a + b + c) / 2
//int area = sqrt(s (s-a)(s-b)(s-c))
//Math.sqrt()


    public  int getAreaOfTriangle( int base, int heigth){
       base = 5;
       heigth = 12;
       return  (base * heigth) / 2;

    }



    public  int getAreaOfTriangle( int a, int b, int c){
        return c =  (a + b + c) / 2;


    }


    public  double  getAreaOfTriangle( double a, double b, double c){
        double semiPerimeter = (a + b + c ) / 2;
       double area  = Math.sqrt(semiPerimeter * (semiPerimeter -a ) * (semiPerimeter - b ) * (semiPerimeter - c));
           return  area;

    }
}
