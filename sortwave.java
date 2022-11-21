
public class sortwave {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n=5;
        for(int i=0;i<n-3;i++){
            for(int j=i+1;j<n-3;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=2;i<n-1;i++){
            for(int j=i+1;j<n-1;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
    
}
