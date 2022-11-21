import java.util.Arrays;

public class unique1 {
    public static void main(String[] args) {
        int[]a={2,2,1,1,0,3,3};
        int n=7;
        int res = 0;
        for(int i=0;i<n;i++) {
            res = res^a[i];
        }
       System.out.println(res);
    }

 

}
