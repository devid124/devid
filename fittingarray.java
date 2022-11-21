import java.util.Arrays;

public class fittingarray {
    public static void main(String[] args) {
        int[]a={7,5,3,2};
        int[]b={5,8,4,7};
        int n=4;
        boolean flag=true;
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
            if(a[i]>b[j]){
            flag=false;
            }
        }
    } 
    if(!flag){
        System.out.println("yes");
    }
    else{
        System.out.println("no");
    }
}
}
