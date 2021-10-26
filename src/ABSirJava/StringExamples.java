package ABSirJava;

public class StringExamples {
    public static void main(String[] args) {
        String str1="java";
        String str2 = new String("Java");
        char c[]={'H','e','l','l','o'};
        String str3 = new String(c,2,3);
        byte b[] = {65,66,67,68,69};
        String str4 = new String(b,2,3);
        System.out.println(str4);
    }
}
