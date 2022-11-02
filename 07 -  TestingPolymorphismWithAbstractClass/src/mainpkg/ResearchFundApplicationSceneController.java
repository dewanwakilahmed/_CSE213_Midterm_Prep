/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpkg;

import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author User
 */
public class ResearchFundApplicationSceneController implements Initializable {

    @FXML    private RadioButton studentRadioButton;
    @FXML    private RadioButton FacultyRadioButton;
    @FXML    private TextField applicantNameTextField;
    @FXML    private TextField amountTextField;
    @FXML    private DatePicker startDatePicker;
    @FXML    private ComboBox<String> durationComboBox;

    private ArrayList<ResearchApplication> reAppList;
    private ArrayList<Person> fakePersonListToSumilateDatabase;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        reAppList = new ArrayList<ResearchApplication>();
        fakePersonListToSumilateDatabase = 
                new ArrayList<Person>();
        
        /*
        // create some dummy Student & Faculty instances for varification
        //and assume that the list is loaded from database
        fakePersonListToSumilateDatabase.add(new Student(...,.,.,.,.,.,));
        fakePersonListToSumilateDatabase.add(new Student(...,.,.,.,.,.,));
        fakePersonListToSumilateDatabase.add(new Student(...,.,.,.,.,.,));
        fakePersonListToSumilateDatabase.add(new Student(...,.,.,.,.,.,));
        fakePersonListToSumilateDatabase.add(new Faculty(...,.,.,.,.,.,));
        fakePersonListToSumilateDatabase.add(new Faculty(...,.,.,.,.,.,));
        fakePersonListToSumilateDatabase.add(new Faculty(...,.,.,.,.,.,));
        fakePersonListToSumilateDatabase.add(new Faculty(...,.,.,.,.,.,));
        fakePersonListToSumilateDatabase.add(new Faculty(...,.,.,.,.,.,));

        Example:  if there are 3 fields in Person class such as firstName, lastName & dob, then the code snippet may look like: 
        fakePersonListToSumilateDatabase.add(
            new Person("Ahsan", "Habib", 
                LocalDate.of(1998, Month.AUGUST, 12))
            );
        */
        //------------------------------
        //assign ToggleGroup to RadioButton (s)
        //add items to ComboBox [1 to 24]
                

    }    

    @FXML
    private void radioButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void submitProposalButtonOnClick(ActionEvent event) {
        /*
        before creating instance of ResearchProposal:
            a) do validation check for applicant id
            b) if valid, varify id exists in database
                (fake person list)

        if verification is ok, create a 
        ResearchApplication instance 
        by adding to reAppList;
        with captured data and add to reAppList
        Lets assume the verified user is at i-th
        position in fake person list
        
        you need to call applyForResearchFund() 
        polymorphic method of Person class:
        for(Person p: pList){
            if(p.getId()== parsed id from textfield)
                p.applyForResearchFund(
                    reAppList.at(reAppList.size()-1)
                );
        }
    
    */
    } 
}
