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
public class TestingStaticFieldAndMethodSceneController implements Initializable {

    @FXML    private TextField idTextField;
    @FXML    private TextField nameTextField;
    @FXML    private TextField cgpaTextField;
    @FXML    private Label outputLabel;
    @FXML    private TextField uniNameTextField;
    
    private Student s;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void createNewStudentButtonOnClick(ActionEvent event) {
        s = new Student(
            Integer.parseInt( idTextField.getText() ),
            nameTextField.getText(),
            Float.parseFloat( cgpaTextField.getText() )
        );
    }

    @FXML
    private void showAllFieldsButtonOnClick(ActionEvent event) {
        outputLabel.setText(
            "Id = " + s.getId()+
            "\nName = " + s.getName()+
            "\nCgpa = " + s.getCgpa()+
            "\nUni Name = " + Student.getUniName()
        );
    }

    @FXML
    private void updateUniNameButtonOnClick(ActionEvent event) {
        
    }
    
}
