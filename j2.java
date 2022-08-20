import java.util.Scanner;

public class j2 {
    public static void main(String[] args) {
    System.out.println("enter age");
    Scanner SC=new Scanner(System.in);
    int a=SC.nextInt();
    if(a>18){
    System.out.println("younger");
    }
    else{
    System.out.println("smaller");
    }
    }
}
