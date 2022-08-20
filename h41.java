import java.util.Scanner;

public class h41 {
    public static void main(String[] args) {
        Scanner SC=new Scanner(System.in);
        System.out.println("enter year");
        int year=SC.nextInt();
        switch(year){
            case 2020:
            System.out.println("normal year");
            break;
            case 2021:
            System.out.println("normal year");
            break;
            case 2022:
            System.out.println("normal year");
            break;
            case 2023:
            System.out.println("normal year");
            break;
            case 2024:
            System.out.println("leap year");
            break;
            default:
            System.out.println("not respond");
        }
    }
}
