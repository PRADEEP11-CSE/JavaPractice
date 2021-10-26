package BegineerSheet;

import java.util.Scanner;

public class NumEvenOrOdd
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Your Number : ");
        int n=sc.nextInt();
        if(n % 2 == 0)
        {
            System.out.println("Your Number is Even");
        }
        else
        {
            System.out.println("Your Number is Odd");
        }


    }
}
