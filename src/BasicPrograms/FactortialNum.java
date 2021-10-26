package BasicPrograms;
import java.util.*;

public class FactortialNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N : ");
        int n,fact=1;
        n= sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            fact=fact*i;

        }
        System.out.println(fact);
    }
}
