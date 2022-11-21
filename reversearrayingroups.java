public class reversearrayingroups {
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5,6};
        int k=3;
        for(int i=0;i<k;i++){
            for(int j=i+1;j<k;j++){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        }
        for(int l=k;l<arr.length;l++){
            for(int m=l+1;m<arr.length;m++){
                int temp1=arr[l];
                arr[l]=arr[m];
                arr[m]=temp1;
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}

