package strings;

public class StringReplace {
    public static void main(String[] args) {

        String  word = "Apple banana strawberry";
        word = word.replace('a', 'e');
        System.out.println(word);
        System.out.println(word.replace('e','a'));

        String countries = "Italia Columbia  Croatia";
        System.out.println(countries.replace(" " ," republic."));

        /////////////


        String foods = "hot lentil soup,hot plov, cold kompot ,cold ice-cream,warm pasta,warm pizza";
        foods.replace ("hot","tasty");
        foods = foods.replace("hot", "tasty");


        System.out.println(foods.replace("hot" , "tasty"));

        System.out.println(foods.replace("cold" ,"cool" ));
        System.out.println(foods.replace("warm" ,"Italian"));
///////////////////


        String letters = "hello everyone, hope you are good, i wish you good luck";
        letters = letters.replace('h', 'a');
        System.out.println(letters);
        letters = letters.replace('e', 'a');
        letters = letters.replace('l', 'a');
        letters = letters.replace('o', 'a');
        letters = letters.replace('v', 'a');
        letters = letters.replace('n', 'a');
        letters = letters.replace('p', 'a');

        letters = letters.replace('u' ,'a');
        letters = letters.replace('d' ,'a');
        letters = letters.replace('g' ,'a');
        letters = letters.replace('w' ,'a');
        letters = letters.replace('s' ,'a');
        letters = letters.replace('k' ,'a');
        letters = letters.replace('i' ,'a');


        System.out.println(letters); ///////





    }
}
