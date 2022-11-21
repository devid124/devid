import java.util.Arrays;

public class sortingele {
    public static void main(String[] args) {
        int []a={2,4,6,8,1};
        int k=2;
        int temp=a[k];
        a[k]=0;
        Arrays.sort(a);
        for(int i=0;i<k;i++){
            a[i]=a[i+1];
        }
        a[k]=temp;
        for (int i : a) {
            System.out.println(i);
        }
    }
}
