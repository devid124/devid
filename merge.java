import java.lang.reflect.Array;
import java.util.Arrays;

public class merge {
    public static void main(String[] args) {
        int[]a={1,3};
        int[]b={4,2,2};
        int a_length=a.length;
        int b_length=b.length;
        int c_length=a.length+b.length;
        int[] c=new int[c_length];
        for(int i=0;i<a.length;i++){
            c[i]=a[i];
        }
        for(int j=0;j<b.length;j++){
            c[a.length+j]=b[j];
        }
       Arrays.sort(c);
       for (int i:c) {
        System.out.println(i);
       }
    }
        
       }
    

