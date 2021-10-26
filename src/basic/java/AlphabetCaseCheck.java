package basic.java;
import java.util.Scanner;
public class AlphabetCaseCheck {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Only Alphabet : ");
        char ch;
        ch=sc.next().trim().charAt(0);
        if(ch>'a' && 'z'<= ch){
            System.out.println("Lower Case");
        }
        else {
            System.out.println("Upper Case ");
        }
    }
}