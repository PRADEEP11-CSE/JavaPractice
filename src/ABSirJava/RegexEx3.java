package ABSirJava;

public class RegexEx3 {
    public static void main(String[] args) {
        String str = "31/12/2021";
        System.out.println(str.matches("[0-3][0-9]/[01][0-2]/[0-9]{4}"));
    }
}
