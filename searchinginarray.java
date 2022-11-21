public class searchinginarray {
    public static void main(String[] args) {
        int[]a={12,45,12,23,2};
        int k=12;
        int temp=0;
        boolean flag=false;
        for(int i=0;i<a.length;i++){
            if(a[i]==k){
                flag=true;
                temp=i;
                break;

            }
        }
        if(!flag){
            System.out.println(-1);
        }
        else{
            System.out.println(temp);
        }
}
}
