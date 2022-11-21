public class numberoccurance {
    public static void main(String[] args) {
        int[]a={8,9,10,12,12,12};
        int k=12;
        int count=0;
        boolean flag=false;
        for(int i=0;i<6;i++){
            if(a[i]==k){
                flag=true;
                count++;
            }
        }
        
        if(!flag){
            System.out.println(0);
        }
        else{
            System.out.println(count);
        }
        }
        }


