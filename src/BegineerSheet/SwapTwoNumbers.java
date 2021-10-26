package BegineerSheet;

public class SwapTwoNumbers {
    public static void main(String[] args) {

        int a=20,b=30;
      /*  int temp;
        temp = a;
        a=b;             //method 1
        b=temp; */

        a=a^b;
        b=a^b;      //method 2 using xor
        a=a^b;

        System.out.println("Before swaping a : 20 and After swaping : "+a);
        System.out.println("Before swaping b : 30 and After swaping : "+b);


    }
}
