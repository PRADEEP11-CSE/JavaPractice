package basic.java;

import java.util.Scanner;

public class SimpleIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n= sc.nextInt();
        for (int num = 1; num <=n; num++) {
            System.out.print(" "+num);

        }
    }
}
