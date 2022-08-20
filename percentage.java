import java.util.Scanner;

public class percentage {
    public static void main(String[] args) {
    System.out.println("taking input from user");
    Scanner SC=new Scanner(System.in);
    System.out.println("enter subject1");
    Float a=SC.nextFloat();
    System.out.println("enter subject2");
    Float b=SC.nextFloat();
    System.out.println("enter subject3");
    Float c=SC.nextFloat();
    System.out.println("enter subject4");
    Float d=SC.nextFloat();
    System.out.println("enter subject5");
    Float e=SC.nextFloat();
    Float percentage=(a+b+c+d+e)/5;
    System.out.println( "all over percentage:"+ percentage);
    }
}
