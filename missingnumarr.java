import java.lang.reflect.Array;
import java.util.Arrays;

public class missingnumarr {
    public static void main(String[] args) {
        int[]a={12,23,10,11};
        int[]b={23,10,11};
        int p=0;
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
            if(a[i]==b[j]){
                continue;
            }else{
                if(a.length>b.length){
                    System.out.println(b[j]);
                }else{
                    p=a[i];
                }
                }
            }
        }
       System.out.println(p);
    }
 }
