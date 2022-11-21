public class swaparray {
    public static void main(String[] args) {
        int []a={1,3,5,6,8};
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
            System.out.println(a[i]);
        }
    }
}
