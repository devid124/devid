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
public double surfaceArea(){
    return 2*3.14*radius*radius+2*3.14*radius*height;
}
public double Volume(){
    return 3.14*radius*radius*height;
}
}
public class h110 {
    public static void main(String[] args) {
    Cylinder cl=new Cylinder();
    cl.setRadius(12);
    System.out.println(cl.getRadius());
    cl.setHeight(11);
    System.out.println(cl.getHeight());
    System.out.println(cl.surfaceArea());
    System.out.println(cl.Volume());
   
    }
}
