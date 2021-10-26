package Algorithms;

import java.util.Arrays;

public class LinearSearchInStrings {
    public static void main(String[] args) {
        String str = "pradeep";
        char target = 'w';
       // System.out.println(search(str,target));
        System.out.println(Arrays.toString(str.toCharArray()));

    }

    static  boolean search(String str,char target){
        if(str.length()==0){
            return false;
        }
        for(char ch: str.toCharArray()) {
            if(ch == target){
                return true;
            }
         }
        return false;

        /* for (int i = 0; i < str.length() ; i++) {
            if(target == str.charAt(i)){
                return true;
            }

        }
        return false; */

    }

}
