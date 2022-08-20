class Employee{
int id;
String name;
public void printdetail(){
System.out.println("my id is"+ id);
System.out.println("my name is "+ name);
}
}
public class h95 {
public static void main(String[] args) {
System.out.println("this is our custom class");
Employee devid=new Employee();
Employee ankit=new Employee();
devid.id=12;
devid.name="jan";
ankit.id=14;
ankit.name="jigari";
devid.printdetail();
ankit.printdetail();
System.out.println(devid.id);
System.out.println(devid.name);
}
}
