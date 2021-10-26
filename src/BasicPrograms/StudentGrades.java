package BasicPrograms;
import java.util.Scanner;

import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Marks : ");
        int m1,m2,m3;
        m1= sc.nextInt();
        m2= sc.nextInt();
        m3= sc.nextInt();
        float avg = m1+m2+m3/(3);
        if(avg>=75){
            System.out.println("A Grade");
        }
        else if(avg>=65&&avg<75){
            System.out.println("B Grade");
        }
        else if(avg>=55&&avg<65){
            System.out.println("C Grade");
        }
        else if(avg>=45&&avg<55){
            System.out.println("D Grade");
        }
        else{
            System.out.println("Fail");
        }

    }
}
