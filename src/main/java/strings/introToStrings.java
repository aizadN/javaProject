package strings;

public class introToStrings {
    public static void main(String[] args) {
        String firstName = "Jonh";
        String lastName = "Doe";
        System.out.println(firstName); //Jonh
        System.out.println(lastName); //Doe

         firstName= "Mike";
          lastName = "Golt";
          System.out.println(lastName);  //Golt

      //create variable
        String myName = "Aizad";
        String myLastName = "Nurlanova";
                System.out.println(myName);
                System.out.println(myLastName);
                System.out.println(myName + " " + myLastName);
                System.out.println("My name is" + " " + myName);
                System.out.println("My last name is" + " " + myLastName);



             String myMiddleName = "Nur";
             System.out.println(myMiddleName);
             System.out.println("My middle name is "  + " " + myMiddleName    );

             /*
             String concatenation

              */

       System.out.println( myName + " " +myLastName+ " " + myMiddleName );

             byte myAge = 27;
             System.out.println("I am " + myAge + " years old.");




             String myAddress = "921 Arlington Haithts Est Golf Road";
                     System.out.println(myAddress);



                     String fruit1 = "apple";
                   //  String fruit2 = new String ( "banana");   //// does not have name

                 System.out.println(fruit1);
                 System.out.println(fruit1 + " "  + fruit1);

             String myMobileNumber = "56657364837";
             System.out.println(myMobileNumber);

             String friendsName = "Bob";
             System.out.println(friendsName);


             String myCity = "Bishkek";
             System.out.println(myCity);


        String city = "London";
        System.out.println(city);
        String city2 = new String("New York");
        System.out.println(city2);
          /*
         length () method returns us the number of chars in string
           */
        System.out.println(city.length());  //6
        System.out.println(city2.length()); // 18

        String name = "Antananarivo";
        System.out.println(name.length());
        System.out.println( " The length of Antananario is " + name.length());
        System.out.println( "Benazir" .length());  //7


        String school = "Codewise";
        school = "Codewise Academy";
        System.out.println(school);


        /*
        equal method compares values of two Strings
         */

        String fruit6 = "apple";
        String fruit7 ="apple";
        String fruit8 = "Apple";

        boolean isSame = fruit6.equals(fruit7);

        System.out.println(isSame);
        isSame = fruit6.equals(fruit8);
        System.out.println(isSame); //false

        fruit6 = "banana";
        fruit7 = "orange";
        System.out.println( " Is Banana same as orange?" + fruit6.equals(fruit7));


        boolean isSame6 = !fruit6.equals(fruit7);  // not equals ,True
        System.out.println(fruit7);

        String state1  = "California";
        String state2 = "Illinois";
        String state3 = "Florida";
        String state4  ="Illinois";
        String state5 = "florida";
        /*
        create boolean variable for every comparison and print
        compare state1 with state2 ==>true;
        compare state2 with state4 ==>true;
        compare state3 with state5 ==>false;
        compare state4 with state3 ==>true

         */
        boolean rr = !state1.equals(state2);//  true
        System.out.println(rr);
        boolean qq = state2.equals(state4); //true
        System.out.println(qq);
        boolean ww = state3.equals(state5);// false
        System.out.println(ww);
         boolean tt =(!state4.equals(state3)); //true
        System.out.println(tt);
        /*
        london  .equals    LONDON ==>false;
        chicago  ..equalsIgnoreCase LONDON ==>false
         */

        int cucumber= 5;
        int tomato = 10;
        int empty = cucumber;  //5
        cucumber=tomato; //10
        tomato = empty; //5
        System.out.println("cucumber" + cucumber); // 10
        System.out.println("tomato" + tomato); //5


    }
}
