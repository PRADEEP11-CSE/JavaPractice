package BegineerSheet;
import java.util.*;

public class DivAndRem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Numbers : ");
        int a,b,rem,quotient;
        a=sc.nextInt();
        b= sc.nextInt();
        rem=a%b;
        quotient=a/b;
        System.out.println("your Remainder is  : "+rem);
        System.out.println("your quotient is : "+quotient);
    }
}
