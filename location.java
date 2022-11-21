import java.util.Scanner;

public class location {
    public static void main(String[] args) {
        int[]a={1,4,6,8};
        System.out.println("enter number");
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int temp=1;
        boolean flag=false;
        for(int i=0;i<a.length;i++){
            if(a[i]==k){
                flag=true;
                temp=i+1;
            }
        }
        if(!flag){
            System.out.println("-1");
        }
        else{
        System.out.println(temp);
    }
}
}