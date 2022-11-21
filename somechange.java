public class somechange {
    public static void main(String[] args) {
        int[]a={1,2,3,4,5};
        for(int i=0;i<a.length-2;i++){
            int temp=a[i];
            a[i]=a[i+2];
            a[i+2]=temp;
        }
        for (int i : a) {
            System.out.println(i);
        }
    }
}
