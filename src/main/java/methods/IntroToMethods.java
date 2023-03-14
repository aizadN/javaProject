package methods;

public class IntroToMethods {

    String String = "sdf";

    String getCapitalOfFrance(){
        /*
        here you can write any code
         */
        return "Paris";
        /*
        YOU CANNOT WRITE ANY CODE AFTER RETURN
         */
    }


    double getPI(){
        /*
        a lot of logic here
         */
        return 3.14;
    }

    int getZero(){
        return 0;

    }

    char getLetter(){
        return 'a';
    }


    double getAreaOfRectangle(double length, double width){
        return length * width;
    }

    /*
    create method to get perimeter of triangle
     */
    double getPerimeterOfTriangle(double a, double b, double c){
        return a + b + c;
    }

    /*
    create a method that takes String as parameter
    and returns the length of the String
     */
    static int getLengthOfString(String str){
        return str.length();
    }

    public static void main(String[] args) {
        IntroToMethods intro = new IntroToMethods(); //creating object
        System.out.println(intro.getAreaOfRectangle(5.4, 7.6));

        double areaOfRectangle = intro.getAreaOfRectangle(5.4, 7.6);

        int length = getLengthOfString("Barcelona");
        System.out.println(length);



    }








}