package BasicPrograms;
import java.util.Scanner;

public class SumOfNnaturalNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N : ");
        int n,sum=0;
        n=sc.nextInt();
        for (int i = 0; i <=n ; i++) {
            sum = sum+i;


        }
        System.out.println(sum);
    }
}
