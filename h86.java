public class h86 {
static void foo(){
    System.out.println("devid");
}
static void foo(int a){
System.out.println("devid " +a);
}
static void foo(int a,int b){
System.out.println("devid "+ a + b);
}
public static void main(String[] args) {
    foo(1,5);
}
}
