
package javafxapplication4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class LoadPaymentSceneController implements Initializable {

    @FXML
    private TextArea LeaveAppFromEmpFxID;

   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    

    @FXML
    private void ViewLeaveApplicationButtonClick(ActionEvent event) {
        
                  LeaveAppFromEmpFxID.setText("");
        File f = null;
        FileInputStream readFile = null;
        DataInputStream readData = null;
        String reason="";
        try {
            f = new File("sendApplication.bin");
            if(!f.exists()){
                LeaveAppFromEmpFxID.setText("No new Application received ");
            }
            else{
                
                readFile = new FileInputStream(f);

                readData = new DataInputStream(readFile);
             
                while(true){
               
               reason = "Id : "+Integer.toString(readData.readInt())+
                        "\n" +"Name: "+readData.readUTF()+"\n"
                        +"Reason: "+readData.readUTF()+"\n"
                        +"Application :\n "
                        + readData.readUTF()+"\n"
                        +"Next Application :\n";
                    LeaveAppFromEmpFxID.appendText(reason);
                }
            }
        } catch (IOException ex) {
           
            Logger.getLogger(LoadPaymentSceneController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(readData != null) readData.close();
            } catch (IOException ex) {
                Logger.getLogger(LoadPaymentSceneController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
  
    }
    
}
