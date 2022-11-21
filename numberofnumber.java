public class numberofnumber {
    public static void main(String[] args) {
        int[]a={11,34,12,21};
        int count=0;
        int k=1;
        for(int i=0;i<a.length;i++){
            int temp=a[i];
        while(temp!=0){
            int digit=temp%10;
            if(digit==k)
                count++;
                temp=temp/10;   
        }
        }
        System.out.println(count);
    }
}
