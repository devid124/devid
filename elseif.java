import java.util.Scanner;

public class elseif {
    public static void main(String[] args) {
    System.out.println("enter your age");
    Scanner SC=new Scanner(System.in);
    int a=SC.nextInt();
    if(a>56){
        System.out.println("you are old");
    }
    else if(a>35){
        System.out.println("you are young");
    }
    else if(a>10){
    System.out.println("you are child");
}
else if(a>10){
    System.out.println("you are baby");
}
else{
    System.out.println("you r cute");
    }
}
}