package strings;

public class StringTrim {
    public static void main(String[] args) {
        /*
        trim ()mrthod removes empty spaces from both ends ot the String

         */

        String batch = " Batch 2 is cool";
        System.out.println(batch);
        batch = batch.trim();
        System.out.println(batch);


      batch =  batch.concat("Bena");
        System.out.println(batch);

        batch.strip();


    }
}
