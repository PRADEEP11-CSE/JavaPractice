package BasicPrograms;
import java.util.*;


public class APSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a,d & n to print AP Series :  ");
        int  a,d,n;
        a= sc.nextInt();
        d= sc.nextInt();
        n= sc.nextInt();
        int term=a;
        for (int i = 0; i < n; i++) {
            System.out.print(term+ ",");
            term=term+d;
       }

    }
}
