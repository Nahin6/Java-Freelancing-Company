
package javafxapplication4;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
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
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class LoadApplyPaidMembershipSceneController implements Initializable {

    @FXML
    private TextField IDfortakeBASISMembershipFxID;
    @FXML
    private TextField NametForTakeBASISMembershipFxID;
    @FXML
    private TextField EmailForTakeBASISMembershipFxId;
    @FXML
    private TextField AdressFortakeBASISMembershipFxid;
    @FXML
    private TextField PhneNoFortakeBASISMembershipFxid;
    @FXML
    private DatePicker DatePickFortakeBASISMembershipfxID;
    @FXML
    private Label ConfirmationMsgLabel;
    @FXML
    private ComboBox GenderForBASISmembershipComboBox;

   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        GenderForBASISmembershipComboBox.getItems().addAll("Male","Female");
       
    }    

    @FXML
    private void SubmitBasisMembershipFormButtonClick(ActionEvent event) {
        
               Membership takeMembership = new Membership(  
                    Integer.parseInt(IDfortakeBASISMembershipFxID.getText()),
                    Integer.parseInt(PhneNoFortakeBASISMembershipFxid.getText()),
                    "Member name : "+NametForTakeBASISMembershipFxID.getText(),
                    EmailForTakeBASISMembershipFxId.getText(),
                    AdressFortakeBASISMembershipFxid.getText(),
                    DatePickFortakeBASISMembershipfxID.getValue()

                );
        IDfortakeBASISMembershipFxID.setText(null);     PhneNoFortakeBASISMembershipFxid.setText(null);  
        NametForTakeBASISMembershipFxID.setText(null);  EmailForTakeBASISMembershipFxId.setText(null);
        AdressFortakeBASISMembershipFxid.setText(null); DatePickFortakeBASISMembershipfxID.setValue(null);
        GenderForBASISmembershipComboBox.setValue(null);
        File f = new File("BASISPaidMember.bin");
        ObjectOutputStream StoreRec=null;
        try {
            if(f.exists())
                StoreRec = new AppendableObjectOutputStream(new FileOutputStream(f,true));
            else
                StoreRec = new ObjectOutputStream(new FileOutputStream(f,true));
            StoreRec.writeObject(takeMembership);
            StoreRec.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        ConfirmationMsgLabel.setText("Congratulations!! your form has been submitted to BASIS\n Now you can complete the payment for become a Paid member");
    }
    
   

    @FXML
    private void SendPayemntForMembershipButtonClick(ActionEvent event) throws IOException {
        
               Alert alert = new Alert (Alert.AlertType.CONFIRMATION);
            alert.setHeaderText(" Did you submit the form?!! ");
          //  alert.showAndWait();
            
              Optional<ButtonType> result = alert.showAndWait();
             if(result.get() == ButtonType.OK)
           
             {
                     //alert.showAndWait();
               Parent ForgetpassceneParent = FXMLLoader.load(getClass().getResource("LoadApplyPaidMembershipPaymentScene.fxml"));
            Scene s = new Scene(ForgetpassceneParent);
          
            
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            window.setScene(s);
            window.show();
         
        }
        else{
   
            Alert("cancelled!"); 
            
           
                      Parent ForgetpassceneParent = FXMLLoader.load(getClass().getResource("LoadApplyPaidMembershipScene.fxml"));
            Scene s = new Scene(ForgetpassceneParent);
          
            
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            window.setScene(s);
            window.show();
        

    }
        

    }
       private void Alert(String s) {
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setContentText(s);
        a.showAndWait();    
        
        //ForgetPassFxId.setText(null);
          // label.setText("Password Recovery Done. Now you can login");
    } 

    @FXML
    private void BackToBasisButton(ActionEvent event) throws IOException {
        
   
      Parent ForgetpassceneParent = FXMLLoader.load(getClass().getResource("BASISmemberScene.fxml"));
            Scene s = new Scene(ForgetpassceneParent);
          
            
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            window.setScene(s);
            window.show();
    }
}

