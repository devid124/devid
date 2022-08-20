class Circle{
float radius;
public float area(){
return 3.14f*(radius*radius);
}
public float parameter(){
return 7.28f*radius;
}
}
public class h101 {
    public static void main(String[] args) {
    Circle c=new Circle();
    c.radius=3;
    System.out.println(c.area());
    System.out.println(c.parameter());
        
    }
}
