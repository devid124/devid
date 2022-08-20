
import java.util.Scanner;

public class h40 {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner SC=new Scanner(System.in);
        int a=SC.nextInt();
        if(a<25){
            System.out.println(true);
        }
       else if(a==25){
        System.out.println("equal");
       }
       else{
        System.out.println("wrong");
       }
    }
}
