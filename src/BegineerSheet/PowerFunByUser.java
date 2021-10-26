package BegineerSheet;

import java.util.Scanner;

public class PowerFunByUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter b,e : ");
        float base = sc.nextFloat();
        float exponent = sc.nextFloat();
        double result =Math.pow(base,exponent);
        System.out.println(result);
 }


}
