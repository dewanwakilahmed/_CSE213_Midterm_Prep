/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author User
 */
public class FullNameDisplaySceneController implements Initializable {

    @FXML
    private TextField firstNameTextField;
    @FXML
    private TextField lastNameTextField;
    @FXML
    private Label fullNameLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void showFullNameButtonOnClick(MouseEvent event) {
        fullNameLabel.setText(
        
            "Full Name: " + firstNameTextField.getText()
                + " " +
            lastNameTextField.getText()
        );
    }

    @FXML
    private void mouseEnteredOnShowFullNameButton(MouseEvent event){
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setTitle("Information Alert");
        a.setContentText("Don't hover unnecessarily.");
        //a.showAndWait();         
        a.show();  
    }
    
}
