
package javafxapplication4;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class EmployeeSendMonthlyUpdateSceneController implements Initializable {

    @FXML
    private TextField MonthTxtId;
    @FXML
    private TextField NewUserVisitedTxtId;
    @FXML
    private TextField CustomerRegTxtId;
    @FXML
    private TextField FreelancerRegTxtId;
    @FXML
    private TextField DeletedAccTxtId;
    @FXML
    private TextField InvestmentTxtId;
    @FXML
    private TextField ProfitTxtId;
    @FXML
    private TextField NumOfOrderTxtId;
    @FXML
    private TextField NumOfDeliverdOrderTxtId;
    @FXML
    private Label StoreEmpInfoLvlFx;

  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    

    @FXML
    private void StoreMonthlyupdateButtonOnClick(ActionEvent event) {
        
     
        Employee emp = new Employee(  
                 MonthTxtId.getText(),
                 InvestmentTxtId.getText(),
                 ProfitTxtId.getText(),
                 Integer.parseInt(NewUserVisitedTxtId.getText()),
                 Integer.parseInt(CustomerRegTxtId.getText())  ,
                 Integer.parseInt(FreelancerRegTxtId.getText()),
                 Integer.parseInt(DeletedAccTxtId.getText()),
                 Integer.parseInt(NumOfOrderTxtId.getText()),
                 Integer.parseInt(NumOfDeliverdOrderTxtId.getText())
                
                );
       MonthTxtId.setText(null);  NewUserVisitedTxtId.setText(null);    
       CustomerRegTxtId.setText(null);  FreelancerRegTxtId.setText(null);     
       DeletedAccTxtId.setText(null);InvestmentTxtId.setText(null);
       ProfitTxtId.setText(null); NumOfOrderTxtId.setText(null);
       NumOfDeliverdOrderTxtId.setText(null);
    
        File f = new File("MonthlyUpdate.bin");
        ObjectOutputStream oos=null;
        try {
            if(f.exists())
               oos = new AppendableObjectOutputStream(new FileOutputStream(f,true));
           else
               oos = new ObjectOutputStream(new FileOutputStream(f,true));
          
         
          oos.writeObject(emp);
            oos.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        StoreEmpInfoLvlFx.setText("Information Stored Successfully" );
    }
    
}
