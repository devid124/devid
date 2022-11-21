import java.util.Scanner;

public class swap1 {
    public static void main(String[] args) {
        System.out.println("enter a and b");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("before swapping " + "\n" +a +"\n"+ b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after swapping " +"\n" + a +"\n" + b);
    }
}
