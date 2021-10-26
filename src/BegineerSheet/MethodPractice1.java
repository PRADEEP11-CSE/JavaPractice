package BegineerSheet;
import java.util.Scanner;

public class MethodPractice1 {
    public static void main(String[] args) {
        //int ans=sum();
        //System.out.println(ans);
        sum2();
    }
    static int sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Num : ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd Num : ");
        int b = sc.nextInt();
        int sum = a+b;
        //System.out.println("sum is : "+sum);
        return sum;
    }
    static void sum2(){
        System.out.println("hello fun");
    }

}
