package basic.java;

import java.util.Scanner;

public class LargestAmong3Nums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 Nums : ");
        int a,b,c;
        a= sc.nextInt();
        b= sc.nextInt();
        c= sc.nextInt();

     /*  //Method 1:
        int max=0;
        if(a>b){
            max=a;
        }
        else {
            max = b;
        }
        if(c>max){
            max=c;
        }
        System.out.println(max);   */

   /*     //Method 2:
        int max=a;
        if(b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }
        System.out.println(max);   */

        //Method 3:
        System.out.println(Math.max(c,Math.max(a,b)));
    }
}
