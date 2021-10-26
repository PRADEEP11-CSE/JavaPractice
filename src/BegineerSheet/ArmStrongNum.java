package BegineerSheet;

import java.util.Scanner;

public class ArmStrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n= sc.nextInt();
        int r,sum=0;
        int m=n;
        while(n>0){
            r=n%10;
            n/=10;
            sum=sum+r*r*r;
        }
        if(sum==m){
            System.out.println("is a armstrong");
        }
        else {
            System.out.println("not an armstrong");
        }

    }
}
