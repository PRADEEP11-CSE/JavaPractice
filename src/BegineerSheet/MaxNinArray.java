package BegineerSheet;

public class MaxNinArray {
    public static void main(String[] args) {
        int[] arr = {233,4,4533,555,6,66,7,73};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
