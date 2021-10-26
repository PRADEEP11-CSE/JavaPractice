package BegineerSheet;

import java.util.Scanner;

public class LargestAmong3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Your Numbers : ");
        int n1,n2,n3,max;
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();
    /*    if(n1>=n2&&n1>=n3){
            System.out.println("Largest Number is : "+n1);
       }
        else if (n2>=n1&&n2>=n3){
            System.out.println("Largest Number is : "+n2);     //Method 1
        }
        else{
            System.out.println("Largest Number is  : "+n3);
        }  */

    /*    max=n1;
        if(n2>max){
            max=n2;
        }
        if(n3>n2){          //Method 2
            max=n3;
        }
        System.out.println(max);  */


        max=Math.max(n3,Math.max(n1,n2));  //Method 3
        System.out.println(max);

    }
}
