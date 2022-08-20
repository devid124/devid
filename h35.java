import java.util.Scanner;

public class h35 {
    public static void main(String[] args) {
    System.out.println("take the input from user sub1");
    Scanner SC=new Scanner(System.in);
    int a=SC.nextInt();
    System.out.println("enter subject2");
    int b=SC.nextInt();
    System.out.println("enter subject3");
    int c=SC.nextInt();
    float k=(a+b+c)/3.0f;
    System.out.println("over all percentage:"+k);
    if(k>=40 && a>=33 && b>=33 && c>=33){
        System.out.println("pass");  
}
else{
    System.out.println("fail;");
}
    }
}
