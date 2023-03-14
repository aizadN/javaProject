package strings;

public class StringSubstring {
    public static void main(String[] args) {
        String message = "Hello Chicago, why are you so cold and windy?";
        String city = message.substring(6,12);
        System.out.println(city); //Chicag
        String city1 = message.substring(6,13); //chicago
        System.out.println(city1);
        String firstWorld = message.substring(0,4); //Hell
        System.out.println(firstWorld);
        String firstWorld1 = message.substring(0,5);//Hello
        System.out.println(firstWorld1);
        String question1 = message.substring(15,34); //why are you so cold
        System.out.println(question1);
        System.out.println(question1 +"?"); //why are you so cold?
        String  city3 = message.substring(6,13); //Chicago
        System.out.println(city3);
        String  question = message.substring(15); //why are you so cold and windy
        System.out.println(question);



        String welcomeSing = "Welcome to USA, our population is 140 million people, the average salary is 90k dollars," +
               " and our president is Joe Biden";
        System.out.println(welcomeSing);
        System.out.println(welcomeSing.substring(0,14) + "?" + " " +welcomeSing.substring(20,21).toUpperCase() +welcomeSing.substring(21,52) + " " +"and"+ " " + welcomeSing.substring(0,1).toUpperCase());


        System.out.println(welcomeSing.substring(11,14)); //Usa
       String country1 = welcomeSing.substring(11,14);

        //String country = welcomeSing.substring(welcomeSing.indexOf("U") , welcomeSing.indexOf(", "));
        //System.out.println(country);  //USA


        String population = welcomeSing.substring(welcomeSing.indexOf("140") , welcomeSing.indexOf("people" ));
        System.out.println(population);

        String salary = welcomeSing.substring(76,87);
       System.out.println(salary); //90k dollars




        String phrase = "Just one positive thought in the morning can change your whole day ";
        String  j = phrase.substring(phrase.indexOf("J")  ,phrase.indexOf(" in") );
        //System.out.println(j);  ///////wrong
       // System.out.println(phrase.substring(0,4) + " a " + phrase.substring(18,25)); //just a thought
        //System.out.println(phrase.substring(8,17) + " " + phrase.substring(33,41));//positive morning





         //whole morning

        /////////new assigment

        String str1 = "hi";
        String str2 = "bye";
        System.out.println(str1 +str2 +str2 +str1);  // hubyebyehi
        System.out.println(str1 + " " + str2 + " " +str1.toUpperCase() + " " +str1.toUpperCase() +str2.toUpperCase() + str2.toUpperCase() + str2.toUpperCase() +str1 + str2);

        System.out.println(str2.substring(0,1) + str1.substring(1)); //bi  same method
        System.out.println(str1.replace('h' , 'b')); //bi            same method
        System.out.println(str2.charAt(0) +"" +str1.charAt(1)); //b1                same method



        String see = "see";
        String hear = "hear";
        System.out.println(see.substring(0,1)  + hear.substring(1,4) ); //sear
        System.out.println(hear.replace('h', 's'));///sear
        System.out.println(see.charAt(0) + hear.substring(1,4) );//sear


















    }
}
