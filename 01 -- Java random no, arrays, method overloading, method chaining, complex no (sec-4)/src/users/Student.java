package users;

public class Student {
//class Student {
    private int id;
    private String name;
    String[] grades, courseIds;
    int[] credits;

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

    public String[] getCourseIds() {
        return courseIds;
    }

    public void setCourseIds(String[] courseIds) {
        this.courseIds = courseIds;
    }

    public int[] getCredits() {
        return credits;
    }

    public void setCredits(int[] credits) {
        this.credits = credits;
    }

    public void setStudentInfo(){
        //
    }
    
    public void showGradePoints(){
        //
    }  
}
