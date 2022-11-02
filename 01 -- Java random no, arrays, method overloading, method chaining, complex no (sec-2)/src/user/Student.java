
package user;

public class Student {
    private int id; private String name;
    
    private String[] courseIDs, grades;
    private int[] credits;
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

    public String[] getGrades() {
        return grades;
    }

    public void setGrades(String[] grades) {
        this.grades = grades;
    }

    public int[] getCredits() {
        return credits;
    }

    public void setCredits(int[] credits) {
        this.credits = credits;
    }

    public String[] getCourseIDs() {
        return courseIDs;
    }

    public void setCourseIDs(String[] courseIDs) {
        this.courseIDs = courseIDs;
    }
    public void setStudInfo(){
        //...
    }
    public void showGradePoints(){
        
    }
}
