package ABSirJava;

public class RegexEx1 {
    public static void main(String[] args) {
        int b=011;
        String str = String.valueOf(b);
        //String str=b+"01";
        System.out.println(str.matches("[01]*"));
    }
}
