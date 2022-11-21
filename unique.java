import java.util.Arrays;

public class unique {
    public static void main(String[] args) {
        int[]a={6,2,5,2,2,6,6};
        Arrays.sort(a);
        for(int i=0;i<a.length;i++){
            boolean isUnique=false;
            for(int j=0;j<i;j++){
                if(a[i]==a[j]){
                    isUnique=true;
                    break;
                }
            }
            if(!isUnique){
                System.out.println(a[i]);
            }
            } 
        }
}

