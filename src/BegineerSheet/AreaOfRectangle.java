package BegineerSheet;
import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter l & b : ");
        int l,b,h;
        l=sc.nextInt();
        b=sc.nextInt();
        double area = l*b;
        System.out.println("Area of Rectangle is : "+area);
    }
}
