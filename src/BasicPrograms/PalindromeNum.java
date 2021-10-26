package BasicPrograms;
import java.util.Scanner;

public class PalindromeNum {
    public static void main(String[] args) {
        int n,r,rev=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num : ");
        n=sc.nextInt();
        int m=n;
        while(n>0){
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        if(rev==m){
            System.out.println("Your Num is Palindrome");
        }
        else
        {
            System.out.println("Your Num is Not Palindrome");
        }

    }
}
