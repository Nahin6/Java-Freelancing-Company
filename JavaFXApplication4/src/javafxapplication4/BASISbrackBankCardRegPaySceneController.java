
package javafxapplication4;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class BASISbrackBankCardRegPaySceneController implements Initializable {

    @FXML
    private TextField AccountIdFxid;
    @FXML
    private TextField NameOFAccountFxId;
    @FXML
    private TextField EmailFxid;
    @FXML
    private TextField AdressFxid;
    @FXML
    private TextField ContractNoFxid;
    @FXML
    private DatePicker DatePickerToApply;
    @FXML
    private ComboBox GenderForBASISmembershipComboBox;
    @FXML
    private Label ApplyConfirmLabel;

   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        GenderForBASISmembershipComboBox.getItems().addAll("Male","Female");
    
    }    

    @FXML
    private void BackButtonClick(ActionEvent event) throws IOException {
        
          Parent scene2Parent = FXMLLoader.load(getClass().getResource("BASISmemberScene.fxml"));
            Scene s = new Scene(scene2Parent);
          
            
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            window.setScene(s);
            window.show();
    }

    @FXML
    private void ApplyForCardButton(ActionEvent event) {
        
 
        
                    Membership takeMembership = new Membership(  
                    Integer.parseInt(AccountIdFxid.getText()),
                    Integer.parseInt(ContractNoFxid.getText()),
                    NameOFAccountFxId.getText(),
                    EmailFxid.getText(),
                    AdressFxid.getText(),
                    DatePickerToApply.getValue()

                );
        AccountIdFxid.setText(null);     ContractNoFxid.setText(null);  
        NameOFAccountFxId.setText(null);  EmailFxid.setText(null);
        AdressFxid.setText(null); DatePickerToApply.setValue(null);
        GenderForBASISmembershipComboBox.setValue(null);
        File f = new File("BracCard.bin");
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
        
        ApplyConfirmLabel.setText("Congratulations!! Your Application has been sent to BASIS \n Please wait for their Confirmation email");
    }
    
}
