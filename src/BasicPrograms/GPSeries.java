package BasicPrograms;
import java.util.*;

import java.util.Scanner;

public class GPSeries {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter  a,r & n to Print GP Series : ");
        int a,r,n;
        a=sc.nextInt();
        r= sc.nextInt();
        n= sc.nextInt();
        int term=a;
        for (int i = 0; i < n; i++) {
            System.out.print(term+ ",");
            term=term*r;

        }
    }
}
