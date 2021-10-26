package BegineerSheet;
public class MaxNuminArray {
    public static void main(String[] args) {
        int[] arr = {1000,2,34,500,56,65};
        System.out.println(max(arr));
    }
    static int max(int[] arr){
        int max = arr[0];
        for (int i = 1; i <arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;

    }

}
