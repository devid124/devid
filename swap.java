import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        System.out.println("enter a and b");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("before swapping " + "\n" +a +"\n"+ b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("after swapping " +"\n" + a +"\n" + b); 
    }
}
