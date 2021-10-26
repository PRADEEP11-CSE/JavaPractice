package ABSirJava;

public class RegexEx4 {
    public static void main(String[] args) {
        String str = "abcAdGS@#$%&*12398";
        //str=str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(str.replaceAll("[^a-zA-Z0-9]",""));
    }
}
