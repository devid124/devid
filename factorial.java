import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int factorial =1;
        System.out.println("enter number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            factorial = factorial*i;
        }
        System.out.println(factorial);

    }
}
