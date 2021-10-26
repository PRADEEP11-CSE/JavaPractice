package BasicMethodPrograms;

import java.util.Scanner;


public class AddTeoNum {
    public static void main(String[] args) {
        int ans = sum2();
        System.out.println(ans);
    }


    static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your 1st Num: ");
        int a=sc.nextInt();
        System.out.print("Enter Your 2nd Num: ");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.print("Sum is : "+sum);  }


    static int sum2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your 1st Num: ");
        int a = sc.nextInt();
        System.out.print("Enter Your 2nd Num: ");
        int b = sc.nextInt();
        int sum = a + b;
        return sum;
        //System.out.print("Unreachable Statement");

    }
}

