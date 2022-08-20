class Cylinder{
private int radius;
private int height;
public int getRadius() {
    return radius;
}
public void setRadius(int radius) {
    this.radius = radius;
}
public int getHeight() {
    return height;
}
public void setHeight(int height) {
    this.height = height;
}

}
public class h109 {
public static void main(String[] args) {
Cylinder cl=new Cylinder();
cl.setRadius(11);
cl.setHeight(23);
System.out.println(cl.getRadius());
System.out.println(cl.getHeight());
}
}
