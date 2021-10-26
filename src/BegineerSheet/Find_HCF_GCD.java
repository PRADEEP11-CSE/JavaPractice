package BegineerSheet;

import java.util.Scanner;

public class Find_HCF_GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Num's : ");
        int a= sc.nextInt();
        int b= sc.nextInt();
        while(a!=b)
        {
            if(a>b)
                a-=b;
            else
                b-=a;

        }

        System.out.println("GCD of 2 num's is : "+a);
        //System.out.println("LCM of 2 num's is : "+(a*b/GCD));


    }

}
