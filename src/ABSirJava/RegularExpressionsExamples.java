package ABSirJava;

public class RegularExpressionsExamples {
    public static void main(String[] args) {
        String str="4";

        //==============Matching Symbols==================//
        //System.out.println(str.matches("."));  //Any character.
        //System.out.println(str.matches("[abc]"));  //Exactly Given (Single)Character ex: "a" .
        //System.out.println(str.matches("[ab][c]"));  //for two characters.
        //System.out.println(str.matches("[^abc]"));  //except abc.
        //System.out.println(str.matches("[a-z][0-9]"));  //Example "a9".
        //System.out.println(str.matches("t|p")); //a|b  (a or b) Single Digit ex: "a".
        //System.out.println(str.matches("AB"));  //exactly AB(2 characters).

        //===================Mata Characters====================//
        //System.out.println(str.matches("\\d")); //\d is for single digit.-> //actually \d is correct but use 2 \\ becoz in java it supports Escape character,so use 2 \\.
        //System.out.println(str.matches("\\D")); //\D is for not digits (simply other than digit).
        //System.out.println(str.matches("\\s"));  //\s for single space.
        //System.out.println(str.matches("\\S"));  //\S for Single not Space.
        //System.out.println(str.matches("\\w")); // single Alphabet or char.
        //System.out.println(str.matches("\\W"));  // other than Alphabet and Digits.

        //=====================Quantifiers=====================//
        //System.out.println(str.matches(".*"));  // * is for 0 or more times.  .* is example.
        //System.out.println(str.matches(".+"));  // + is for 1 or more times.
        //System.out.println(str.matches(".?"));   // ? is for 0 or 1 time.
        //System.out.println(str.matches(".{5}"));   // {x} is for x times. ex: x=5; so 5 times.
        System.out.println(str.matches(".{2,4}"));  // {x,y} is for Between x and y Times.

    }

}
