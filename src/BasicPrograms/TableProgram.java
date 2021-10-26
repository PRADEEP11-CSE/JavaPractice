package BasicPrograms;
import java.util.*;


public class TableProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N: ");
        int n;
        n=sc.nextInt();
        for (int i = 1; i <=10 ; i++) {
            System.out.println(n + " x " + i +" = " + n*i);
            
        }
        
    }
}
