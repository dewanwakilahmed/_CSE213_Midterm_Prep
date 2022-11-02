/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package users;

import mainpkg.Student;

/**
 *
 * @author User
 */
public class ResearchStudent extends Student {
    private int noOfPublications;
    private String experienceDetail;

    public ResearchStudent(int id, String name, float cgpa, int noOfPublications, String experienceDetail) {
        super(id, name, cgpa);
        this.noOfPublications = noOfPublications;
        this.experienceDetail = experienceDetail;
    }

    
    
    public int getNoOfPublications() {
        return noOfPublications;
    }

    public void setNoOfPublications(int noOfPublications) {
        this.noOfPublications = noOfPublications;
    }

    public String getExperienceDetail() {
        return experienceDetail;
    }

    public void setExperienceDetail(String experienceDetail) {
        this.experienceDetail = experienceDetail;
    }
    
    public String getResearchStudentStringEquivalent(){
           return "ID = "+getId()+
            "\nName = "+getName()+
            "\nCgpa = "+this.getCgpa()+
            "\nUniversity Name = "+Student.getUniName()+
            "\nNo of publications = "+noOfPublications+
            "\nExperience Details = "+experienceDetail;
    }
    
}
