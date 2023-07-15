
package javafxapplication4;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;


public class LoaadFeedBackSceneController implements Initializable {

    @FXML
    private TextArea FeedbackAreaFxId;

   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void SeeFeedbackFromCustomerButtonClick(ActionEvent event) {
        FeedbackAreaFxId.setText("");
        File f = null;
        Scanner s; String string; String[] text;
        try {
            f = new File("CustomerFeedback.txt");
            s = new Scanner(f);
            if(f.exists()){
            while(s.hasNextLine()){
            string=s.nextLine();
            text = string.split(",");
            FeedbackAreaFxId.appendText(

             text[0]+"\n" 
                    
                    );
                }
            }
            else 
                FeedbackAreaFxId.setText("No new Feedback received from Customers");
        } 
        catch (IOException ex) {
            Logger.getLogger(LoaadFeedBackSceneController.class.getName()).log(Level.SEVERE, null, ex);
        } 
        finally {
        } 
   
        }
        
}
    

