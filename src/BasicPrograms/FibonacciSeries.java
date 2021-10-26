package BasicPrograms;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a,b & nto print Fibonacci Series : ");
        int a=0,b=1,n,c;
        n= sc.nextInt();
        System.out.print(a+","+b+",");
        for (int i = 0; i < n; i++) {
            c=a+b;
            System.out.print(c+",");
            a=b;
            b=c;
    }
    }
}
