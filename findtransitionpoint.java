public class findtransitionpoint {
    public static void main(String[] args) {
        int[]a={0,0,0,0};
        boolean flag=false;
        int temp=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==1){
              flag=true;
              temp=temp+i;
              System.out.println(temp);
            }
        }
        if(!flag){
            System.out.println(-1);
        }
    }
}
