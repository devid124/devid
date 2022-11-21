import java.util.Scanner;

public class reversestring {
    public static void main(String[] args) {
        System.out.println("enter string");
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String nstr = "";
        for(int i=0;i<s1.length();i++){
            nstr=nstr+s1.charAt(i);

        }
         System.out.println(nstr);
        if(s1.equals(nstr)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}

