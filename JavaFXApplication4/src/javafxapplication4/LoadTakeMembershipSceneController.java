
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


public class LoadTakeMembershipSceneController implements Initializable {

    @FXML
    private TextField IDfortakeMembershipFxID;
    @FXML
    private TextField NametForTakeMembershipFxID;
    @FXML
    private TextField EmailForTakeMembershipFxId;
    @FXML
    private TextField AdressFortakeMembershipFxid;
    @FXML
    private TextField PhneNoFortakeMembershipFxid;
    @FXML
    private DatePicker DatePickFortakeMembershipfxID;
    @FXML
    private ComboBox ComboBoxFortakeMembership;
   
    
    @FXML
    private Label submitFormLabel;
    @FXML
    private Label planLabel;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      ComboBoxFortakeMembership.getItems().add("one months");
      ComboBoxFortakeMembership.getItems().addAll("Three months","Six months","one year");
      ComboBoxFortakeMembership.setValue("Select Plans"); 
    }    

    @FXML
    private void ComboBoxButtonClick(ActionEvent event) {
 

    }

    @FXML
    private void SubmitMembershipFormButtonClick(ActionEvent event) {
        
          Membership takeMembership = new Membership(  
                    Integer.parseInt(IDfortakeMembershipFxID.getText()),
                    Integer.parseInt(PhneNoFortakeMembershipFxid.getText()),
                    "Member name : "+NametForTakeMembershipFxID.getText(),
                    EmailForTakeMembershipFxId.getText(),
                    AdressFortakeMembershipFxid.getText(),
                    DatePickFortakeMembershipfxID.getValue()

                );
        IDfortakeMembershipFxID.setText(null);     PhneNoFortakeMembershipFxid.setText(null);  
        NametForTakeMembershipFxID.setText(null);  EmailForTakeMembershipFxId.setText(null);
        AdressFortakeMembershipFxid.setText(null); DatePickFortakeMembershipfxID.setValue(null);
        ComboBoxFortakeMembership.setValue(null);
        File f = new File("membershipRecord.bin");
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
        
        submitFormLabel.setText("Congratulations!! your form has been submitted \n Now you can complete the payment ");
    }

    @FXML
    private void PaymentpageButtonClick(ActionEvent event) throws IOException {
        
               Alert alert = new Alert (Alert.AlertType.CONFIRMATION);
            alert.setHeaderText("      Did you Submit the form?!! ");
            //alert.showAndWait();
        
         Optional<ButtonType> result = alert.showAndWait();
             if(result.get() == ButtonType.OK)
           
             {
                     //alert.showAndWait();
               Parent ForgetpassceneParent = FXMLLoader.load(getClass().getResource("CustomerPayMembershipScene.fxml"));
            Scene s = new Scene(ForgetpassceneParent);
          
            
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            window.setScene(s);
            window.show();
         
        }
        else{
   
            showCustomInformationAlert("cancelled!"); 
                      Parent ForgetpassceneParent = FXMLLoader.load(getClass().getResource("LoadTakeMembershipScene.fxml"));
            Scene s = new Scene(ForgetpassceneParent);
          
            
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            window.setScene(s);
            window.show();
        

    }
             
    }
      private void showCustomInformationAlert(String alt) {
        Alert warning = new Alert(Alert.AlertType.INFORMATION);
        warning.setContentText(alt);
        warning.showAndWait();         
    } 

    @FXML
    private void BackToCustomerSceneButton(ActionEvent event) throws IOException {
        
           Parent ForgetpassceneParent = FXMLLoader.load(getClass().getResource("CustomerScene.fxml"));
            Scene s = new Scene(ForgetpassceneParent);
          
            
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            window.setScene(s);
            window.show();
    }

    
}


/*
  Alert alert = new Alert (AlertType.CONFIRMATION);
            alert.setHeaderText("      Are you sure?!! ");
          
            
            Optional<ButtonType> result = alert.showAndWait();
             if(result.get() == ButtonType.OK)
           
             {
                     //alert.showAndWait();
               Parent ForgetpassceneParent = FXMLLoader.load(getClass().getResource("ForgetPassWord.fxml"));
            Scene s = new Scene(ForgetpassceneParent);
          
            
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            window.setScene(s);
            window.show();
         
        }
        else{
   
            showCustomInformationAlert("cancelled!"); 
                      Parent ForgetpassceneParent = FXMLLoader.load(getClass().getResource("FXMLlMainScene.fxml"));
            Scene s = new Scene(ForgetpassceneParent);
          
            
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            window.setScene(s);
            window.show();
        

    }
             

}


  private void showCustomInformationAlert(String alt) {
        Alert warning = new Alert(Alert.AlertType.INFORMATION);
        warning.setContentText(alt);
        warning.showAndWait();         
    } 

}


*/
