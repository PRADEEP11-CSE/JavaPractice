package BegineerSheet;
import java.util.*;
public class LeapYear
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Year : ");
        int year = sc.nextInt();
        if (year % 4 == 0)
        {
            if (year % 100 == 0)
            {
                if (year % 400 == 0)
                {
                    System.out.println(year + " is Leap Year");
                } else
                    System.out.println(year +" not a leap year");
             } else
                System.out.println(year+ " is a leap year");
        } else
            System.out.println(year+ " not a leap year");
    }
}
