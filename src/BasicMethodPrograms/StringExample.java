package BasicMethodPrograms;

import org.w3c.dom.ls.LSOutput;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
//        String message=greet();
//        System.out.println(message);

//    static String greet(){
//        String greeting="How are you : ";
//        return greeting;
//    }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name : ");
        String name=sc.next();
        String personal = mygreet(name);
        System.out.println(personal);
    }


    static String mygreet(String name){
        String message="hello " +name;
        return message;
    }
}
