
package javafxapplication4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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


public class LoadHireFreelancerSceneController implements Initializable {

    @FXML
    private TextArea SeeFreeLancerPostTxtArea;
    @FXML
    private TextField FreelacnerNameFxid;
    @FXML
    private TextField FreelancerIDFxid;
    @FXML
    private TextField DesiredWorkFxid;
    @FXML
    private TextArea LeaveMsgForFreelancerTxtArea;
    @FXML
    private Label RequestConfirmationLabel;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
          SeeFreeLancerPostTxtArea.setText("");
        File f = null;
        FileInputStream readFile = null;
        DataInputStream readData = null;
        String PostAdd="";
    try {
            f = new File("PostAdd.bin");
            if(!f.exists()){
                SeeFreeLancerPostTxtArea.setText("No new Post from Freelancers");
            }
            else{
                
                readFile = new FileInputStream(f);

                readData = new DataInputStream(readFile);
             
                while(true){
               
               PostAdd =  "Freelancer Id:"+Integer.toString(readData.readInt())+
                        "\n" +"Freelacner Name: "+readData.readUTF()+"\n"
                        +"Expert at : "
                        + readData.readUTF()+"\n"
                        +"Details : "+readData.readUTF()+"\n \n"
                        +"Next Post :\n";
                    SeeFreeLancerPostTxtArea.appendText(PostAdd);
                }
            }
        } catch (IOException ex) {
           
            Logger.getLogger(LoadHireFreelancerSceneController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(readData != null) readData.close();
            } catch (IOException ex) {
                Logger.getLogger(LoadHireFreelancerSceneController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
             
    }    

    @FXML
    private void SendJobRequestButtonClick(ActionEvent event) {
        
           File f = null;
        FileOutputStream wirteFile = null;
        DataOutputStream writeData = null;
        
        try {
            f = new File("SendJobRequest.bin");
            if(f.exists()) wirteFile = new FileOutputStream(f,true);
            else wirteFile = new FileOutputStream(f);
            writeData = new DataOutputStream(wirteFile);
            writeData.writeInt(Integer.parseInt(FreelancerIDFxid.getText()));
            writeData.writeUTF(FreelacnerNameFxid.getText());
             writeData.writeUTF(DesiredWorkFxid.getText());
            writeData.writeUTF(LeaveMsgForFreelancerTxtArea.getText());

        } catch (IOException ex) {
            Logger.getLogger(LoadHireFreelancerSceneController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(writeData != null) writeData.close();
            } catch (IOException ex) {
                Logger.getLogger(LoadHireFreelancerSceneController.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
        
        RequestConfirmationLabel.setText("Your Request has been sent. \n Please wait until Freelancer accept your job request.  ");
    }

}
