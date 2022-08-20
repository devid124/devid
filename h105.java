import java.util.Random;
import java.util.Scanner;

public class h105 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter o for rock,ener 1 for paper,enter 2 for seissor");
    int userinput=sc.nextInt();
    Random rm=new Random();
    int computerinput=rm.nextInt(3);
    if(userinput==computerinput){
        System.out.println("draw");
    }
    else if(userinput==0&&computerinput==2||userinput==1&&computerinput==0||userinput==2&&computerinput==1){
        System.out.println("you win");
    }
        else {
            System.out.println("computer win");

        }
        if(computerinput==0){
            System.out.println("computerchoice: rock");
        }
        else if(computerinput==1){
            System.out.println("computerchoice: paper");
        }
        else if(computerinput==2){
            System.out.println("computerchoice: seissor");
        }
    }
    }

