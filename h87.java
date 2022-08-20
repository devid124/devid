import javax.sound.sampled.SourceDataLine;

public class h87 {
static int sum(int...arr){
int result=0;
for(int a:arr){
result+=a;
}
return result;
}
public static void main(String[] args) {
System.out.println("the sum of 4 and 5 is " + sum (4,5));
System.out.println("the sum of4 ,3 and 5 is "+ sum(4,3,5));
}
}
