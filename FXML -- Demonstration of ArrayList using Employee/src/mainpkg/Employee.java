package mainpkg;

import java.time.LocalDate;

public class Employee {
    private int id;
    private String name, desig;
    private LocalDate dob;
    private float salary;

    public Employee() {
    }

    public Employee(int id, String name, String desig, LocalDate dob, float salary) {
        this.id = id;
        this.name = name;
        this.desig = desig;
        this.dob = dob;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesig() {
        return desig;
    }

    public void setDesig(String desig) {
        this.desig = desig;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + ", desig=" + desig + ", dob=" + dob + ", salary=" + salary + '}';
    }
    
}
