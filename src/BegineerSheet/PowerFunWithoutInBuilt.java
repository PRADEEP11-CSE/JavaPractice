package BegineerSheet;

import java.util.Scanner;

public class PowerFunWithoutInBuilt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter b,e : ");
        float base,exponent;
        double result = 1;
        base = sc.nextFloat();
        exponent = sc.nextFloat();
        while(exponent!=0){
            result*=base;
            --exponent;
        }
        System.out.println(result);
    }
}
