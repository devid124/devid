class Employee{
    int salary;
    String name;
    public String getName(){
    return name;
    }
    public int getSalary(){
    return salary;
    }
    }
    public class h97 {
    public static void main(String[] args) {
    Employee devid=new Employee();
    devid.name="devid the hero";
    devid.salary=12;
    System.out.println(devid.getName());
    System.out.println(devid.getSalary());
    }
    }
    