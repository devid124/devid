import java.math.BigInteger;
import java.util.Scanner;

public class bignumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first big number");
        String s1=sc.nextLine();
        System.out.println("enter second big number");
        String s2=sc.nextLine();
        BigInteger b1=new BigInteger(s1);
        BigInteger b2=new BigInteger(s2);
        BigInteger sum=b1.add(b2);
        System.out.println("big integer sum " + sum);
    }
}
