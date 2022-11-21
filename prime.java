import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        System.out.println("enter number");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=a/2;
        boolean flag=false;
        if(a==1){
            System.out.println("no");
        }
        else{
        for(int i=2;i<=b;i++){
            if(a%i==0){
            flag=true;
        }
        }
        if(!flag){
            System.out.println("prime");
        }
        else{
            System.out.println("no");
        }
    }
}
}
