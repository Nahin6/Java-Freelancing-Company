
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


public class LoadHelpBoxController implements Initializable {

    @FXML
    private TextField IDforHelpFxID;
    @FXML
    private TextField NameForHelpFxID;
    @FXML
    private TextArea ProblemDetailsFxId;
    @FXML
    private TextField SubjectOfHelpFxID;
    @FXML
    private Label submitMessageFxID;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      
    }    

    @FXML
    private void SubmitProblemButtonClick(ActionEvent event) {
        
    
        
        File f = null;
        FileOutputStream wirteFile = null;
        DataOutputStream writeData = null;
        
        try {
            f = new File("SendGuide.bin");
            if(f.exists()) wirteFile = new FileOutputStream(f,true);
            else wirteFile = new FileOutputStream(f);
            writeData = new DataOutputStream(wirteFile);
            writeData.writeInt(Integer.parseInt(IDforHelpFxID.getText()));
            writeData.writeUTF(NameForHelpFxID.getText());
            writeData.writeUTF(SubjectOfHelpFxID.getText());
            writeData.writeUTF(ProblemDetailsFxId.getText());

        } catch (IOException ex) {
            Logger.getLogger(LoadHelpBoxController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(writeData != null) writeData.close();
            } catch (IOException ex) {
                Logger.getLogger(LoadHelpBoxController.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
        
        submitMessageFxID.setText("Your issue has been stored \n wait for solution");
        
        
    }
    
}
