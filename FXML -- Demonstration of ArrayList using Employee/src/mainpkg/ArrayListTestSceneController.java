/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpkg;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author User
 */
public class ArrayListTestSceneController implements Initializable {

    @FXML    private TextField nameTextField;
    @FXML    private ComboBox<String> desigComboBox;
    @FXML    private TextField idTextField;
    @FXML    private TextField salaryTextField;
    @FXML    private DatePicker dobDatePicker;
    @FXML    private TextField searchIdTextField;
    @FXML    private TextArea outputTextArea;
    private ArrayList<Employee> empList;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        desigComboBox.getItems().addAll(
                "HR Executive",
                "Accountant",
                "Customer Care Manager",
                "Supervisor"
            );
        empList = new ArrayList<Employee>();
        // TODO
    }    

    @FXML
    private void searchEmployeeButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void addNewEmployeeButtonOnClick(ActionEvent event) {
        empList.add(
            new Employee(
                Integer.parseInt(idTextField.getText()),
                nameTextField.getText(),
                desigComboBox.getValue().toString(),
                dobDatePicker.getValue(),
                Float.parseFloat(salaryTextField.getText())     
            )
        );
    }

    @FXML
    private void showAllEmployeeButtonOnClick(ActionEvent event) {
        /*
        int i;
        for(i=0; i<empList.size(); i++){
            outputTextArea.appendText(
                empList.get(i).toString()+"\n"
            );
        }
        */
        for(Employee e: empList){
            outputTextArea.appendText(e.toString());
        }
        
    }
    
}
