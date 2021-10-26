package BasicPrograms;
import java.util.Scanner;


public class MenuDrivenProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ADD");
        System.out.println("SUB");
        System.out.println("MUL");
        System.out.println("DIV");
        System.out.println("Enter 2 Num : ");
        int n1,n2;
        n1=sc.nextInt();
        n2=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Options :");
        String option= sc.nextLine();
        option=option.toUpperCase();
        switch (option){
            case "ADD": System.out.println("sum is "+(n1+n2));
                break;
            case "SUB": System.out.println("sum is "+(n1-n2));
                break;
            case "MUL": System.out.println("sum is "+(n1*n2));
                break;
            case "DIV": System.out.println("sum is "+(n1/n2));
                break;
            default:
                System.out.println("Invalid");
        }


    }
}
