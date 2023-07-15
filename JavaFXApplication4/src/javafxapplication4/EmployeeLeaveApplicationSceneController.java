

package javafxapplication4;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class EmployeeLeaveApplicationSceneController implements Initializable {

    @FXML
    private TextField IDfoLeaveApFxID;
    @FXML
    private TextField NameForLeaveApFxID;
    @FXML
    private TextArea ReasonDetailsFxId;
    @FXML
    private TextField ReasonOfLeaveFxID;
    @FXML
    private Label SubmitDonelabel;

   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    

    @FXML
    private void SubmitLeaveApplicationButtonClick(ActionEvent event) {
        
            File f = null;
        FileOutputStream writeFile = null;
        DataOutputStream writeData = null;
        
        try {
            f = new File("sendApplication.bin");
            if(f.exists()) writeFile = new FileOutputStream(f,true);
            else writeFile = new FileOutputStream(f);
            writeData = new DataOutputStream(writeFile);
            writeData.writeInt(Integer.parseInt(IDfoLeaveApFxID.getText()));
            writeData.writeUTF(NameForLeaveApFxID.getText());
            writeData.writeUTF(ReasonOfLeaveFxID.getText());
            writeData.writeUTF(ReasonDetailsFxId.getText());

        } catch (IOException ex) {
            Logger.getLogger(EmployeeLeaveApplicationSceneController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(writeData != null) writeData.close();
            } catch (IOException ex) {
                Logger.getLogger(EmployeeLeaveApplicationSceneController.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
        
        SubmitDonelabel.setText("Your Application has been Sent \n wait for CEO's mail");
    }
    
}
