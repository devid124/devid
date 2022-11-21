public class index {
    public static void main(String[] args) {
        boolean flag=false;
        int A[]={1,3,5,6};
        int key=5;
        int temp=0;
        for(int i=0;i<A.length;i++){
            if(A[i]==key){
                flag=true;
              temp=temp+i;
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
    
