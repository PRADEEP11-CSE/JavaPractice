package BasicPrograms;

public class GCDNumLCM {
    int gcd(int m,int n){
       while (m!=n) {
           if (m > n) m = m - n;
           else n = n - m;
       }
       return m;
    }

    public static void main(String[] args) {
        GCDNumLCM g=new GCDNumLCM();//creating object and calling
        System.out.println(g.gcd(35,76));
    }
}
