import java.util.Arrays;

public class unique2 {
    public static void main(String[] args) {
        int[]a={1,1,2,3,3};
        int n=5;
        Arrays.sort(a);
        int res=0;
        for(int i=0;i<n;i++){
            res=res^a[i];
        }
        System.out.println(res);
    }
}
