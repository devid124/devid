import java.util.Scanner;

class FahrenheitToCelsius {
    public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.println("enter temprature in fehranite");
   float a=sc.nextFloat();
   a=(a-32)*5/9;
   System.out.println("temprature in calcius" + a);   
}

}