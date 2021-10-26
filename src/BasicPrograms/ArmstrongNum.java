package BasicPrograms;
import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        int n,r,sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num : ");
        n=sc.nextInt();
        int m=n;
        while(n>0){
            r=n%10;
            n=n/10;
            sum=sum+r*r*r;
        }
        //System.out.println(sum);
        if(m==sum){
            System.out.println("Num is armstrong");
        }
        else{
            System.out.println("Num is Not Armstrong");
        }
    }
}
