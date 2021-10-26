package BegineerSheet;

import java.util.Scanner;

public class NumPalindromeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n= sc.nextInt();
        int r,rev=0;
        int m=n;
        while(n>0){
            r=n%10;
            rev=rev*10+r;
            n/=10;
        }
        if(rev==m){
            System.out.println("its a palindrome num ");
        }
        else
            System.out.println("not a palindrome num ");
    }
}
