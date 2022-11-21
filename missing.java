
public class missing {
    public static void main(String[] args) {
        int[]a={1,2,4,5,6};
        int temp=1;
        for(int i=0;i<a.length;i++){
            if(a[i]==temp){
            temp++;
            }
        }
        System.out.println(temp);
    }
}
