import java.util.Scanner;

public class h36 {
    public static void main(String[] args) {
    Scanner SC=new Scanner(System.in);
    System.out.println("enter your annum income");
    float income=SC.nextFloat();
    float tax=0;
    if(income<=2.5){
        tax=tax+0;
    }
    else if(income>2.5f&&income<=5.0f){
        tax=tax+0.05f*(income-2.5f);
    }
    else if(income>5.0f&&income<+10.0f){
        tax=tax+0.05f*(5.0f-2.5f);
        tax=tax+0.2f*(income-5.0f);
    }
    else if(income>10.0f){
        tax=tax+0.05f*(5.0f-2.5f);
        tax=tax+0.2f*(10f-5f);
        tax=tax+0.3f*(income-10f);
    }
    System.out.println("total tax paid by employee:"+tax);
    
    }
}
