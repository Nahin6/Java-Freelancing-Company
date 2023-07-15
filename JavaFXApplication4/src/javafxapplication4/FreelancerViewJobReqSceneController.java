
package javafxapplication4;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;


public class FreelancerViewJobReqSceneController implements Initializable {

    @FXML
    private TextArea ViewJobReqTxtArea;

  
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
                 ViewJobReqTxtArea.setText("");
        File f = null;
        FileInputStream readFile = null;
        DataInputStream readData = null;
        String jobReq="";
        try {
            f = new File("SendJobRequest.bin");
            if(!f.exists()){
                ViewJobReqTxtArea.setText("No new Post from Freelancers");
            }
            else{
                
                readFile = new FileInputStream(f);

                readData = new DataInputStream(readFile);
             
                while(true){
               
               jobReq = "Customer Id:"+Integer.toString(readData.readInt())+
                        "\n" +"Customer Name: "+readData.readUTF()+"\n"
                        +"Work: "+readData.readUTF()+"\n"
                        +"Message :\n "
                        + readData.readUTF()+" \n \n"
                        +"Next Job : \n";
                    ViewJobReqTxtArea.appendText(jobReq);
                }
            }
        } catch (IOException ex) {
           
            Logger.getLogger(FreelancerViewJobReqSceneController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(readData != null) readData.close();
            } catch (IOException ex) {
                Logger.getLogger(FreelancerViewJobReqSceneController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
      
    }    
    
}

