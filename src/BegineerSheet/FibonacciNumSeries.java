package BegineerSheet;

import java.util.Scanner;

public class FibonacciNumSeries {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        int a=0,b=1,c=1;
        System.out.print(a+" , "+b+" , ");
        //for (int i = 0; i <n ; i++) {
            while(c<=n){
                c=a+b;
                System.out.print(c+ " , ");
                a=b;
                b=c;
                c=a+b;

            }

            
        }
    }
    

