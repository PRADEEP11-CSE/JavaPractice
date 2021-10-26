package BegineerSheet;

import java.util.Scanner;

public class AddNumsByMethod {
    public static void main(String[] args) {
        int Sum=add();
        System.out.println(Sum);
    }
    static int add(){
        Scanner sc = new Scanner(System.in);
        int sum,a,b;
        a= sc.nextInt();
        b=sc.nextInt();
        sum=a+b;
        return sum;

    }
}
