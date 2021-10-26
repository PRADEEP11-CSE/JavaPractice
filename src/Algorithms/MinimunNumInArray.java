package Algorithms;

public class MinimunNumInArray {
    public static void main(String[] args) {
    int[] arr = {2,3,-3,34,-45,56,6,77,99};
        System.out.println(min(arr));

    }

    static int min(int[] arr ) {
        int min=arr[0];
        for (int i = 0; i <arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
            }

        }
        return min;
    }

}
