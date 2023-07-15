
package javafxapplication4;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;
import javafx.scene.layout.AnchorPane;


public class LoadPayFrelanccerSceneController implements Initializable {

    @FXML
    private TextField IdForFxid;
    @FXML
    private TextField NumberForFxid;
    @FXML
    private ComboBox ComboBoxIOfPayMethod;
  
    @FXML
    private TextField NameForFxId;
    @FXML
    private Label SeeMsgLabel;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
      ComboBoxIOfPayMethod.getItems().add("Bkash");
      
      ComboBoxIOfPayMethod.getItems().addAll("Nagad","Rocket");
        
    }    

    @FXML
    private void SendPaymentToFrelancerButtonClick(ActionEvent event) {
        
        
        
            File f = null;
        FileOutputStream writepayemnt = null;
        DataOutputStream writeData = null;
        
        try {
            f = new File("Freelancerpayment.bin");
            if(f.exists()) writepayemnt = new FileOutputStream(f,true);
            else writepayemnt = new FileOutputStream(f);
            writeData = new DataOutputStream(writepayemnt);
            writeData.writeInt(Integer.parseInt(IdForFxid.getText()));
             writeData.writeInt(Integer.parseInt(NumberForFxid.getText()));
            writeData.writeUTF(NameForFxId.getText());
        
            
            IdForFxid.setText(null); NumberForFxid.setText(null); NameForFxId.setText(null);
            ComboBoxIOfPayMethod.setValue(null);
            

        } catch (IOException ex) {
            Logger.getLogger(LoadPayFrelanccerSceneController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(writeData != null) writeData.close();
            } catch (IOException ex) {
                Logger.getLogger(LoadPayFrelanccerSceneController.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
          
        TextInputDialog textdialog = new TextInputDialog();
        textdialog.setTitle("Payment Window");
        textdialog.setHeaderText("Enter OTP");
        textdialog.setContentText("Please enter the OTP sent to your Phone Number ");
     
        Optional<String> result = textdialog.showAndWait();
        if(result.isPresent()){
            Alert a = new Alert(Alert.AlertType.INFORMATION);
 
        a.showAndWait();
           
            ShowOTPAlert("OTP verified. payement is successful");
        }
        else {
           
            ShowOTPAlert("Cancelled Successful! ");
        } 
        
        SeeMsgLabel.setText("Your payment has been successfull \n Please send the Transaction ID to your Freelacner");
        
        
    }
    
     private void ShowOTPAlert(String str) {
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setContentText(str);
        a.showAndWait();   
          
    }

   
}
