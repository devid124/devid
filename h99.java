class Sqare{
int side;
public int area(){
return side*side;
}
public int parameter(){
return 4*side;
}
}
public class h99 {
public static void main(String[] args) {
Sqare sq=new Sqare();
sq.side=4;
System.out.println(sq.area());
System.out.println(sq.parameter());

}
}
