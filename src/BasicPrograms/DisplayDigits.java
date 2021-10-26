package BasicPrograms;
import java.util.*;

public class DisplayDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N : ");
        int n,r;
        n= sc.nextInt();
        while(n>0){
            r=n%10;
            n=n/10;
            System.out.println(r);
        }

    }
}
