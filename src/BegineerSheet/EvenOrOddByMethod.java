package BegineerSheet;

import java.util.Scanner;

public class EvenOrOddByMethod {
    public static void main(String[] args) {
        EorO();
    }
    static void EorO(){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        if(n%2==0){
            System.out.println("even");
        }
        else
        {
            System.out.println("odd");
        }
    }
}
