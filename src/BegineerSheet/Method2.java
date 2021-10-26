package BegineerSheet;

public class Method2 {
    public static void main(String[] args) {
        String message = mygreet("Pradeep");
        System.out.println(message);
    }

    static String mygreet(String name) {
        String greeting ="hello "+name;
        return greeting;
    }

}
