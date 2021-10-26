package BegineerSheet;
import java.util.*;

public class AsciiValueOfChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Char : ");
        char c;
        c=sc.next().charAt(0);
        int Ascii = c;
        System.out.println("The ASCII value of " + c + " is: " + Ascii);
    }
}
