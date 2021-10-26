package BegineerSheet;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n= sc.nextInt();
        for (int i = 2; i <n/2 ; i++) {
            if( n%i==0){
                System.out.println("not a prime");
            }


         else {
                System.out.println("is a prime");
            }
         break;

        }
    }
}
