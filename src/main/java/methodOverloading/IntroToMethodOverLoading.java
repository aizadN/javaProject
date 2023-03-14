package methodOverloading;

public class IntroToMethodOverLoading {
    /*
    method names must be unique.We cannot have two or more methods to use the same name
     */

    public  int getAreaOfRectangle(int length, int width){
        return length * width;
    }

    public  int getAreaOfRectangle(long length, long width){
        return (int )(length * width);
    }

    public  int getAreaOfRectangle(double length, double width){ //different parameters like long and double
        System.out.println(9.4 + "fog");
        /*
        substring (int beginIndex)
        substring (int begin, int end)
         */
        return (int )(length * width);
    }
    //==============================///========================///============================///
    /*
    get getRerimeterOfSquare methods,return type = int
     */

    public int  getRerimeterOfSquare( int a ){

        return (4 * a) ;
    }

    public int  getRerimeterOfSquare( long a){

        return  (int ) ( 4 * a);
    }


    public int  getRerimeterOfSquare( double a){

        return ( int) ( 4 * a);
    }



}
