import java.util.Scanner;
import java.util.Random;
class Game{
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    int a = rand.nextInt(100);
    public void play(){
        for(int count=0;count<10;count ++){
            System.out.printf("You have %d chances left.%n", 10-count);
            System.out.println("Enter your number: ");
            int num = sc.nextInt();
            if(num==a){
                System.out.println("Congratualtions, you've found a match.;)");
                System.out.printf("You took %d moves.",10-(10-count));
                break;
            }
            if(num>a){
                System.out.println("Enter lower number.");
            }
            else{
                System.out.println("Enter higher number.");
            }
        }
    }
}
public class h108 {
    public static void main(String[] args) {
        Game g = new Game();
        g.play();
    }
}

