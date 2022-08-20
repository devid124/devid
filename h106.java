
class Employee{
private int id;
private String name;
public Employee(){
    name="dev";
    id=12;
}
public String getName(){
    return name;
}
public void setName(String n){
    name=n;
}
public int getId(){
return  id; 
}
public void setId(int i){
    id=i;
}
}

public class h106 {
    public static void main(String[] args) {
        Employee devid=new Employee();
        //devid.setId(12);
        //devid.setName("dev");
        System.out.println(devid.getName());
        System.out.println(devid.getId());
    }
}
