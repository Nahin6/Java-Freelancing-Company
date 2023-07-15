
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


public class EmployeeGuideCustomerSceneController implements Initializable {

    @FXML
    private TextArea IssueBoxFxId;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void SeeCustomerProblemButtonClick(ActionEvent event) {

              IssueBoxFxId.setText("");
        File f = null;
        FileInputStream readFile = null;
        DataInputStream readData = null;
        String issue="";
        try {
            f = new File("SendGuide.bin");
            if(!f.exists()){
                IssueBoxFxId.setText("No new post from customer");
            }
            else{
                
                readFile = new FileInputStream(f);

                readData = new DataInputStream(readFile);
             
                while(true){
               
               issue =  "Id:"+Integer.toString(readData.readInt())+
                        "\n" +"Name: "+readData.readUTF()+"\n"
                        +"Subject: "+readData.readUTF()+"\n"
                        +"Issue In details: "
                        + readData.readUTF()+"\n"
                        +"Next Issue \n";
                    IssueBoxFxId.appendText(issue);
                }
            }
        } catch (IOException ex) {
           
            Logger.getLogger(EmployeeGuideCustomerSceneController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(readData != null) readData.close();
            } catch (IOException ex) {
                Logger.getLogger(EmployeeGuideCustomerSceneController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
