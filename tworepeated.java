public class tworepeated {
    public static void main(String[] args) {
        int[]a={1,3,3,2,1};
        //int i;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<i;j++){
                if(a[i]==a[j]){
                    System.out.println(a[i]);
                }
            }

        }
       
    }
}
