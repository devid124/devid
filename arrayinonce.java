public class arrayinonce {
    public static void main(String[] args) {
        int[]a={1,1,2,3,4,4};
        int j;
        for(int i=0;i<a.length;i++){
            for(j=0;j<a.length;j++){
                if(i==j){
                    continue;
                }
                if(a[i]==a[j]){
                    break;
                }

            }
            if(j==a.length){
            System.out.println(a[i]);
        }
    }
}
}