package mainpkg;

import java.time.LocalDate;

//public class Person {
public abstract class Person {
    /*
    private String name, gender;
    private LocalDate dob;
    */
    protected String name, gender;
    protected LocalDate dob;
    
    public Person() {
    }

    public Person(String name, String gender, LocalDate dob) {
        this.name = name;
        this.gender = gender;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", gender=" + gender + ", dob=" + dob + '}';
    }
    public abstract void applyForResearchFund(ResearchApplication ra);
    public abstract void doSome();
}
