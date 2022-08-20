import java.util.Scanner;

public class h39 {
    public static void main(String[] args) {
        Scanner SC=new Scanner(System.in);
        System.out.println("enter website");
        String website=SC.next();
        if(website.endsWith(".org")){
            System.out.println("organisation website");
        }
        else if(website.endsWith(".com")){
            System.out.println("commercial website");
        }
        else if(website.endsWith(".in")){
            System.out.println("indian website");
    }
}
}
