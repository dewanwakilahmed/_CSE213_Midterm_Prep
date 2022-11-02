package mainpkg;

import java.time.LocalDate;

public class Student extends Person{
    private int id;
    private float cgpa;
    private String dept;
    
    public Student(){}
    public Student(int id, float cgpa, String dept) {
        this.id = id;
        this.cgpa = cgpa;
        this.dept = dept;
    }

    public Student(int id, float cgpa, String dept, String name, String gender, LocalDate dob) {
        //super(name, gender, dob);
        this.name=name; this.gender=gender; this.dob=dob;
        this.id = id;
        this.cgpa = cgpa;
        this.dept = dept;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getCgpa() {
        return cgpa;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        
        //return "Student{super.toString() + " + " id=" + id + ", cgpa=" + cgpa + ", dept=" + dept + '}';
        
        return "Student:\n" + "name=" + name 
                + ", gender=" + gender + ", dob=" 
                + dob + " id=" + id + ", cgpa=" 
                + cgpa + ", dept=" + dept + "\n\n";
    }
    @Override
    public void doSome(){   //implemented method
        System.out.println("doSome in Student");
    }    
    
}
