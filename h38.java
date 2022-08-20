import java.util.Scanner;

public class h38 {
    public static void main(String[] args) {
    Scanner SC=new Scanner(System.in);
    System.out.println("enter age");
    int age=SC.nextInt();
    switch(age){
        case 18-> System.out.println("you are adult");
        case 25-> System.out.println("you are a looking job");
    }
    System.out.println("enjoy:"+age);
    }
}
