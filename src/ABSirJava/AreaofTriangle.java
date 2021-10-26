package ABSirJava;

import java.util.Scanner;

public class AreaofTriangle {
    public static void main(String[] args) {
        areaT();
   }
    static void areaT(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter h : ");
        double h= sc.nextFloat();
        System.out.println("Enter b : ");
        double b=sc.nextFloat();
        double area = (0.5)*b*h;
        System.out.println("Area of Triangle : "+area);

    }

}

