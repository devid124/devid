public class predict {
    public static void main(String[] args) {
        int[][]a={{1,1,0},
                  {1,1,0},
                   {1,1,0}};
                   int n=3;
                   int m=3;
        int res=0;
        int temp=0;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<m;j++){
                if(a[j][i]==0){
                    count++;
                }
            }
            if(count>temp){
                temp = count;
                res=i;
            }
        }
        System.out.println(res);
    }
}
