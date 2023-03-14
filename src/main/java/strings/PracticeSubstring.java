package strings;

public class PracticeSubstring {
    public static void main(String[] args) {

        String first_name = "Jacob";
        String last_name = "Coffe";
        //String name1 = "Jee";
        //String name2 = "Cee";
        //String name3 = "Jacee";
        //String name4 = "Cob";
        //String name5 = "FeccobA";
        //String  name6 = "Ofjo";

        int lengthOfLastname = last_name.length();

        System.out.println(""+first_name.charAt(0) + last_name.charAt(lengthOfLastname - 1) + last_name.charAt(lengthOfLastname - 1));
        //System.out.println(last_name.charAt(0) + last_name.substring(lengthOfLastname -1, lengthOfLastname)  + last_name.substring(4,5));
        String cee = last_name.charAt(0) + last_name.substring(lengthOfLastname -1, lengthOfLastname)  + last_name.substring(4,5);
        System.out.println(cee);
        System.out.println( first_name.substring(0,2) + cee.toLowerCase());
        System.out.println(last_name.substring(0,2) + first_name.charAt(first_name.length() -1));
        System.out.println(last_name.substring(3,4).toUpperCase()  +last_name.charAt(lengthOfLastname -1)  + first_name.charAt(2) + last_name.substring(0,1).toLowerCase() +last_name.charAt(1)) ;

        System.out.println(last_name.substring(1,2).toUpperCase() +last_name.charAt(3) +first_name.substring(0,1).toLowerCase() +last_name.charAt(1));
        System.out.println(last_name.charAt(0) + last_name.substring(1,2) +first_name.substring(4,5));//Cob
        System.out.println(first_name.substring(0,1) + last_name.charAt(4) + last_name.substring(4,5));//Jee
        System.out.println("" +first_name.charAt(0) +last_name.charAt(lengthOfLastname - 1) + last_name.charAt(lengthOfLastname -1));
        System.out.println(first_name.charAt(0) + first_name.substring(1,2) +last_name.substring(0,1).toLowerCase() + last_name.substring(lengthOfLastname -1) +last_name.charAt(lengthOfLastname -1));
    int lengthOfFirst =first_name.length();
        System.out.println(last_name.substring(2,3).toUpperCase() +last_name.charAt(4) + last_name.substring(0,1).toLowerCase() +last_name.substring(0,1).toLowerCase() +first_name.charAt(3) + first_name.charAt(lengthOfFirst -1) +first_name.substring(1,2).toUpperCase());
  ////////////GOOD JOB////





    }
}
