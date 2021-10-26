package Algorithms;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {23,344,4,45,56,6,7,7,87,8,656};
        int target= 56;
        System.out.println(linearSearch(arr,target,1,7));
    }
    static int linearSearch(int[] arr,int target,int start,int end){
        if(arr.length==0){
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if(arr[index] == target){
                return index;
            }
        } return -1;
    }
}
