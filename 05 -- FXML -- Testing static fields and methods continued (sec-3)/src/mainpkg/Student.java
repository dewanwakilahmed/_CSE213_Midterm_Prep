package mainpkg;

public class Student {
    private int id;
    private String name;
    private float cgpa;
    private static String uniName="IUB";

    public Student() {
        id=0; name="TBA"; cgpa=0.0f;
    }
    
    public Student(int id, String name, float cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
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

    public float getCgpa() {
        return cgpa;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }

    public static String getUniName() {
        return uniName;
    }

    public static void setUniName(String uniName) {
        Student.uniName = uniName;
    }
    
    public String getStringEquivalent(){
           return "ID = "+id+
            "\nName = "+getName()+
            "\nCgpa = "+this.getCgpa()+
            "\nUniversity Name = "+uniName;        
    }
    
    
}
