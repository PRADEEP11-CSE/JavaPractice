package BasicPrograms;
import java.util.*;


public class YoungOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age : ");
        int age = sc.nextInt();
        if(age>=14&&age<=55){
            System.out.println("Your are Young");
        }
        else
            System.out.println("You are Not Young");
    }
}
