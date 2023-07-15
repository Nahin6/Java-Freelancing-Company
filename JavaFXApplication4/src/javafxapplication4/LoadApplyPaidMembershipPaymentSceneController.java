
package javafxapplication4;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;


public class LoadApplyPaidMembershipPaymentSceneController implements Initializable {

    @FXML
    private ComboBox MethodComboBox;
    @FXML
    private Label PayemntConfirmaitonLabel;
    @FXML
    private TextField numberFXid;

  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      MethodComboBox.getItems().addAll("Bkash","Nagad","Rocket");
    }    

    @FXML
    private void SendPayemntToBASIS(ActionEvent event) {
        
        TextInputDialog textdialog = new TextInputDialog();
        textdialog.setTitle("BASIS payment Window");
        textdialog.setHeaderText("Enter OTP");
        textdialog.setContentText("Please enter the OTP sent to your Mobile Number");
     
        Optional<String> result = textdialog.showAndWait();
        if(result.isPresent()){
            
           
            Alert("OTP verified.Congratulations!! Payment Successful!!");
        }
        else {
           
            Alert("Cancelled Successful! ");
        }
        
        
    }
 private void Alert(String s) {
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setContentText(s);
        a.showAndWait();  
        
      numberFXid.setText(null);  MethodComboBox.setValue(null);
        
      
           PayemntConfirmaitonLabel.setText("Your Payment has been successful \n Now you can take our Premium services ");
    }
    @FXML
    private void BAckPage(ActionEvent event) throws IOException {
                Parent scene2Parent = FXMLLoader.load(getClass().getResource("BASISmemberScene.fxml"));
            Scene s = new Scene(scene2Parent);
          
            
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            window.setScene(s);
            window.show();
    }
    
}


