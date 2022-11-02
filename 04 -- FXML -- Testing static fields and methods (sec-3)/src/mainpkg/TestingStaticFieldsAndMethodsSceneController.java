/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author User
 */
public class TestingStaticFieldsAndMethodsSceneController implements Initializable {

    @FXML
    private TextField idTextField;
    @FXML
    private TextField nameTextField;
    @FXML
    private TextField cgpaTextField;
    @FXML
    private TextField uniNameTextField;
    @FXML
    private Label outputLabel;

    private Student s;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void createStudentButtonOnClick(ActionEvent event) {
        //Student s = new Student(
        s = new Student(
            Integer.parseInt(idTextField.getText()),
            nameTextField.getText(),
            Float.parseFloat(cgpaTextField.getText())
        );
    }

    @FXML
    private void viewStaticFieldButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void viewAllFieldsButtonOnClick(ActionEvent event) {
        outputLabel.setText("");
        outputLabel.setText(
            "ID = "+s.getId()+
            "\nName = "+s.getName()+
            "\nCgpa = "+s.getCgpa()+
            "\nUniversity Name = "+Student.getUniName()
        
        );
    }

    @FXML
    private void changeUniNameButtonOnClick(ActionEvent event) {
    }
    
}
