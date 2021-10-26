package BasicPrograms;

import java.util.Scanner;

public class CountDigitsOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N : ");
        int n,count=0;
        n= sc.nextInt();
        while(n>0){

            n=n/10;
            count++;

        }
         System.out.println(count);
    }
}
