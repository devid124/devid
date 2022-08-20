class Employee{
int id;
int salary;
String name;
public void printdetails(){
System.out.println("my id is " + id);
System.out.println("my name is " + name);
System.out.println("my salary is"+ salary);
}
public int getSalary(){
return salary;

}
}
public class h96 {
public static void main(String[] args) {
System.out.println("this is our own class");
Employee devid=new Employee();
devid.id=15;
devid.salary=18;
devid.name="dev";
devid.printdetails();
}
}
