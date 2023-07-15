
package javafxapplication4;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class LoadTakePaidServicesSceneController implements Initializable {

   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }  
    
    
    
    @FXML
    private void GetEBLmasterCardButton(ActionEvent event) throws IOException {
        
         Parent scene2Parent = FXMLLoader.load(getClass().getResource("BASISeblMasterCardRegPayScene.fxml"));
            Scene s = new Scene(scene2Parent);
          
            
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            window.setScene(s);
            window.show();
        
 
    }

    @FXML
    private void GetBracbankCardButton(ActionEvent event) throws IOException {
        
         Parent scene2Parent = FXMLLoader.load(getClass().getResource("BASISbrackBankCardRegPayScene.fxml"));
            Scene s = new Scene(scene2Parent);
          
            
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            window.setScene(s);
            window.show();
  
    }

    @FXML
    private void GetRentalFacilityButton(ActionEvent event) throws IOException {
        
        
         Parent scene2Parent = FXMLLoader.load(getClass().getResource("BASISrentalFacilityRegPayScene.fxml"));
            Scene s = new Scene(scene2Parent);
          
            
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            window.setScene(s);
            window.show();
     
    }
    
}
