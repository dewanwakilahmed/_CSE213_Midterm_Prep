package mainpkg;

import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ComplexNoTestingSceneController implements Initializable {

    @FXML    private TextField firstRealTextField;
    @FXML    private TextField firstImgTextField;
    @FXML    private TextField secondRealTextField;
    @FXML    private TextField secondImgTextField;
    @FXML    private ComboBox<String> countComboBox;
    @FXML    private Label sumLabel;
    @FXML    private Label allCNsDetailsLabel;
    //ComplexNo[] complexArr;
    ArrayList<ComplexNo> complexList;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        countComboBox.getItems().add("1");
        countComboBox.getItems().add("2");
        countComboBox.getItems().addAll("3","4","5");
        
        complexList = new ArrayList<ComplexNo>();
        
        ComplexNo cn1 = new ComplexNo(3,5);
        
        sumLabel.setText(cn1.toString());
    }  
    
    /*
    //Array version
    @FXML
    private void showRandomCNsButtonAOnClick(ActionEvent event) {
            Random r = new Random();
            int i, len = Integer.parseInt(
                    countComboBox.getValue().toString()
            );
            complexArr =  new ComplexNo[len+2];
            complexArr[0] = new ComplexNo(
                    Integer.parseInt(
                            firstRealTextField.getText()
                    ),
                    Integer.parseInt(
                            firstImgTextField.getText()
                    )                    
            );
            complexArr[1] = new ComplexNo(
                    Integer.parseInt(
                            secondRealTextField.getText()
                    ),
                    Integer.parseInt(
                            secondImgTextField.getText()
                    )                    
            );            
            for(i=2; i<complexArr.length; i++){
                complexArr[i] = new ComplexNo(
                        r.nextInt(100), r.nextInt(100)
                );
            }
            String output="";
            for(i=0; i<complexArr.length; i++){
                if(i<2){
                    output += "user defined CN-"+i+" is: "
                            + complexArr[i].getStringValue()+"\n";
                }
                else{
                     output += "randomly defined CN-"+i+" is: "
                            + complexArr[i].getStringValue()+"\n";
                }
                
            }
            allCNsDetailsLabel.setText(output);
            
    }
    */
    
    //ArrayList version
    @FXML
    private void showRandomCNsButtonAOnClick(ActionEvent event) {
        Random r = new Random();
        int i=0;
        complexList.add(  new ComplexNo( 
                Integer.parseInt(
                    firstRealTextField.getText()
                    ),
                Integer.parseInt(
                    firstImgTextField.getText()
                ) 
            ) //end of constructor
        );//end of add method

        complexList.add(  new ComplexNo( 
                Integer.parseInt(
                    secondRealTextField.getText()
                    ),
                Integer.parseInt(
                    secondImgTextField.getText()
                ) 
            ) //end of constructor
        );//end of add method
        int len = Integer.parseInt(
                    countComboBox.getValue().toString()
            );
        for(i=0; i<len; i++){
            complexList.add(
                new ComplexNo(
                    r.nextInt(100),r.nextInt(100)
                )
            );
        }
        
        String output="";
        /*
        for(i=0; i<complexList.size(); i++){
            if(i<2){
                output += "user defined CN-"+i+" is: "
                    + complexList.get(i).getStringValue()+"\n";
            }
            else{
                output += "randomly defined CN-"+i+" is: "
                    + complexList.get(i).getStringValue()+"\n";
            }
        }//end for
        */
        
        for(ComplexNo c: complexList){
            if(i<2){
                output += "user defined CN-"+i+" is: "
                    + c.getStringValue()+"\n";
            }
            else{
                output += "randomly defined CN-"+i+" is: "
                    + c.getStringValue()+"\n";
            }
            i++;
        }//end for   
        
        allCNsDetailsLabel.setText(output);
            
    }
    
    @FXML
    private void showSumOfCNsButtonAOnClick(ActionEvent event) {
        ComplexNo addedComplexNo = ComplexNo.add(complexList);
        //ComplexNo addedComplexNo = ComplexNo.add(complexArr);
        sumLabel.setText(
                "Sum of ALL CNs is: "
                +addedComplexNo.getStringValue()
        );
    }
    
}
