class Circle{
private float radius;
public float getArea(){
return 3.14f*radius*radius;
}
public void setArea(float r){
    radius=r;
}
}

public class h104 {
public static void main(String[] args) {
Circle c=new Circle();
c.setArea(2);
System.out.println(c.getArea());
}
}
