
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


public class FreelancerPostAddSceneController implements Initializable {

    @FXML
    private TextField NameForPostFxid;
    @FXML
    private TextField IdForPostFxid;
    @FXML
    private TextArea WritePostInDetailFxid;
    @FXML
    private Label PostConfirmatonlabel;
    @FXML
    private TextField ExpertFieldsFxid;

   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    

    @FXML
    private void PostAddButtonClikc(ActionEvent event) {
        
            
        File f = null;
        FileOutputStream wirteFile = null;
        DataOutputStream writeData = null;
        
        try {
            f = new File("PostAdd.bin");
            if(f.exists()) wirteFile = new FileOutputStream(f,true);
            else wirteFile = new FileOutputStream(f);
            writeData = new DataOutputStream(wirteFile);
            writeData.writeInt(Integer.parseInt(IdForPostFxid.getText()));
            writeData.writeUTF(NameForPostFxid.getText());
             writeData.writeUTF(ExpertFieldsFxid.getText());
            writeData.writeUTF(WritePostInDetailFxid.getText());
            
            IdForPostFxid.setText(null);  NameForPostFxid.setText(null);  ExpertFieldsFxid.setText(null);
            WritePostInDetailFxid.setText(null);
        } catch (IOException ex) {
            Logger.getLogger(FreelancerPostAddSceneController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(writeData != null) writeData.close();
            } catch (IOException ex) {
                Logger.getLogger(FreelancerPostAddSceneController.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
        
        PostConfirmatonlabel.setText("Your Post has been shared ");
    }
    
}
