package ifElse;

public class IfIf {
    public static void main(String[] args) {
        String weather = "warm and rainy";


        if (weather.equals("cold!")){
            System.out.println("cold,stay at home!");
        }
        else if (weather.equals("hot")){
            System.out.println("hot, stay at home");
        }
        else if (weather.equals("rainy")){
            System.out.println("rainy,stay at hom");
        }
        else {
            System.out.println("party hard!");
        }

        /////////////////////////////////////////

        if (weather.contains("cold!")){
            System.out.println("cold,stay at home!");
        }
        else if (weather.contains("hot")){
            System.out.println("hot, stay at home");
        }
        else if (weather.contains("rainy")){
            System.out.println("rainy,stay at hom");
        }
        else {
            System.out.println("party hard!");
        }
//////////////////////////////////////////////////////////
        if (weather.contains("cold!")){
            System.out.println("cold,stay at home!");
        }
        else if (weather.contains("HOT")){
            System.out.println("hot, stay at home");
        }
        else if (weather.contains("rainy")){
            System.out.println("rainy,stay at hom");
        }
        else {
            System.out.println("party hard!");
        }

//////////////IF
        if (1<2){
            System.out.println("one is less than two");
        }
        if(1<3){
            System.out.println( "one is less than tree");
    }
        if(1<4){
            System.out.println( "one less than four");
        }
        if (1>5){
            System.out.println("one less than five");

        }
    }
}
