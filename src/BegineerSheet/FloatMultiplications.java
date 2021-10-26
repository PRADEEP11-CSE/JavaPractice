package BegineerSheet;
import java.util.Scanner;

public class FloatMultiplications
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A and B : ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        double mul = a*b;
        System.out.println("Multiplication of A and b is :"+mul);
    }
}
