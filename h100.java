import javax.xml.transform.Source;

class Rectangle{
int length;
int width;
public int area(){
return length*width;
}
public int parameter(){
return 2*(length+width);
}
}
public class h100 {
public static void main(String[] args) {
Rectangle rc=new Rectangle();
rc.length=2;
rc.width=4;
System.out.println(rc.area());
System.out.println(rc.parameter());
    
}
}
