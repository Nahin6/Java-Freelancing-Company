
package javafxapplication4;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class LoadComplainBoxSceneController implements Initializable {

   
    private TextArea IDforComplainFx;
    private TextArea NameForCompainFx;
     @FXML
    private TextArea CustomerCoplainBoxFxId;

   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void SendCompainToCeoButtonClick(ActionEvent event) {
        
        File customerfile = null;
        FileWriter fw = null;
     
        try {

            customerfile = new File("CustomerFeedback.txt");      
            if(customerfile.exists()) fw = new FileWriter(customerfile,true);
            else fw = new FileWriter(customerfile);
           
            fw.write(                
            CustomerCoplainBoxFxId.getText()+"\n"	
            );           
       CustomerCoplainBoxFxId.setText(null);
        } catch (IOException ex) {
            Logger.getLogger(LoadComplainBoxSceneController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(fw != null) fw.close();
            } catch (IOException ex) {
                Logger.getLogger(LoadComplainBoxSceneController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
}

}