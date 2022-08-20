class Employee{
private int id;
private String name;
public String getName(){
return name;
}
public void setName(String n){
    name=n;
}
public int getId(){
return id;
}
public void setId(int i){
    id=i;
}
}

public class h103 {
public static void main(String[] args) {
Employee devid=new Employee();
devid.setName("dev");
devid.setId(12);
System.out.println(devid.getName());
System.out.println(devid.getId());
    
}
}
