package BegineerSheet;

import java.util.Arrays;

public class ReverseanArray {
    public static void main(String[] args) {
        int[] arr = {12,33,3,54,344,45,5,6,767};
        swap(arr,2,3);
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    static void swap(int[] arr,int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }
}
