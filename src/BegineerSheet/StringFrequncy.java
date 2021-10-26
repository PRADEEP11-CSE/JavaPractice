package BegineerSheet;

import java.util.Scanner;

public class StringFrequncy {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter your String : ");
//        String str= sc.nextLine();
        String str = "this book is good";
        int frequency=0;
        char ch = 's';
        for (int i = 0; i < str.length(); i++) {
            if(ch==str.charAt(i)){
                ++frequency;
            }
            
        }
        System.out.println("Frequency of "+ch+" is : "+frequency);

    }
}

