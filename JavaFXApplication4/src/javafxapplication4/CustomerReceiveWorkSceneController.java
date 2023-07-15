
package javafxapplication4;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;


public class CustomerReceiveWorkSceneController implements Initializable {

    @FXML
    private TextArea ProjcetDisplayTxtArea;

   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    

    @FXML
    private void ViewReceivedProjectButtonClick(ActionEvent event) {
        
           ProjcetDisplayTxtArea.setText("");
        File f = null;
        FileInputStream readFile = null;
        DataInputStream readData = null;
        String Project="";
        try {
            f = new File("uploadProject.bin");
            if(!f.exists()){
                ProjcetDisplayTxtArea.setText("No Project Received yet!!");
            }
            else{
                
                readFile = new FileInputStream(f);

                readData = new DataInputStream(readFile);
             
                while(true){
               
               Project =  "Received Project : \n \n"
                        + readData.readUTF()+"\n"
                        ;
                    ProjcetDisplayTxtArea.appendText(Project);
                }
            }
        } catch (IOException ex) {
           
            Logger.getLogger(CustomerReceiveWorkSceneController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(readData != null) readData.close();
            } catch (IOException ex) {
                Logger.getLogger(CustomerReceiveWorkSceneController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
