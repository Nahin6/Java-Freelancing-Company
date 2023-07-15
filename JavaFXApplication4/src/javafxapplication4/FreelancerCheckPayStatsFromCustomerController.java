
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


public class FreelancerCheckPayStatsFromCustomerController implements Initializable {

    @FXML
    private TextArea ViewPaymentInfoTxtArea;

  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
     
        
        
    }    

    @FXML
    private void CheckPaymentInfoButtonClick(ActionEvent event) {
        
        ViewPaymentInfoTxtArea.setText("");
        File f = null;
        FileInputStream readFile = null;
        DataInputStream readData = null;
        String Payment="";
        try {
                f = new File("Freelancerpayment.bin");
                if(!f.exists()){
                ViewPaymentInfoTxtArea.setText("No new payment received  ");
            }
            else{
                readFile = new FileInputStream(f);
                readData = new DataInputStream(readFile);
                
                while(true){
                    Payment = "payemnt received from : \n"+"ID : "+
                            Integer.toString(readData.readInt())+"\n"+"phone no : "+
                            Integer.toString(readData.readInt())+ "\n"+ "Name : "+
                            readData.readUTF()+"\n \n"
                            ;
                    ViewPaymentInfoTxtArea.appendText(Payment);
                }
            }
        } catch (IOException ex) {
           
            Logger.getLogger(FreelancerCheckPayStatsFromCustomerController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(readData != null) readData.close();
            } catch (IOException ex) {
                Logger.getLogger(FreelancerCheckPayStatsFromCustomerController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
    }
    
}
