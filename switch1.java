import java.util.Scanner;

public class switch1 {
    public static void main(String[] args) {
    System.out.println("enter your age");
    Scanner SC=new Scanner(System.in);
    int age=SC.nextInt();
    switch(age){
     case 18:
     System.out.println("you are become adult");
     break;
     case 23:
     System.out.println("you are become husband");
     break;
     case 67:
     System.out.println("you go for rest");
     break;
     default:
     System.out.println("enjoy");
 
   }
   System.out.println("thanks");
}

}
