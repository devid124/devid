class Employee{
private int salary;
private String name;

public int getSalary() {
    return salary;
}

public void setSalary(int salary) {
    this.salary = salary;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}
}
public class h107 {
    public static void main(String[] args) {
    Employee devid=new Employee();
    devid.setName("devu");
    devid.setSalary(10);
    System.out.println(devid.getName());
    System.out.println(devid.getSalary());
    }
}
