package BasicPrograms;

public class CountOccurences {
    public static void main(String[] args) {
        int n=1231141,count=0;
        while (n >0) {
            int r=n%10;
            if(r==1){
                count++;
            }
            n=n/10;
       }
        System.out.println(count);


    }
}
