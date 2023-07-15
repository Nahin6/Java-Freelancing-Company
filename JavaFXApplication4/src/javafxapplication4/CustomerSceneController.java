
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
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class CustomerSceneController implements Initializable {

 
    @FXML
    private BorderPane MainBorderPane;
    @FXML
    private Button ClearView;

   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    
    
   
    @FXML
    private void CustomerLogOutBttonClick(ActionEvent event) throws IOException {
        
                Parent scene2Parent = FXMLLoader.load(getClass().getResource("FXMLlMainScene.fxml"));
            Scene s = new Scene(scene2Parent);
          
            
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            window.setScene(s);
            window.show();
    }

        private void loadCustomerMultiScenes(String ui) {
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource(ui+".fxml"));
            MainBorderPane.setCenter(root);
        } catch (IOException ex) {
            Logger.getLogger(CustomerSceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @FXML
    private void hireFreelancerButttonOnClick(ActionEvent event) {
        
          loadCustomerMultiScenes ("LoadHireFreelancerScene");
    }

    @FXML
    private void payFreelancerButttonOnClick(ActionEvent event) {
        
          loadCustomerMultiScenes ("LoadPayFrelanccerScene");
    }

    @FXML
    private void TakeMembershipButtonOnClick(ActionEvent event) {
        
          loadCustomerMultiScenes ("LoadTakeMembershipScene");
    }
    
     @FXML
    private void ReceiveWorkButtonClick(ActionEvent event) {
        
     loadCustomerMultiScenes   ("CustomerReceiveWorkScene");
    }

    @FXML
    private void ComplainBoxButtonOnClick(ActionEvent event) {
        
          loadCustomerMultiScenes ("LoadComplainBoxScene");
    }

    @FXML
    private void HelpDeskButtonOnClick(ActionEvent event) {
        
        loadCustomerMultiScenes ("LoadHelpBox");
    }


     @FXML
    private void ClearViewOFCustomerButtonOnClick(ActionEvent event) throws IOException {
        
             Parent scene2Parent = FXMLLoader.load(getClass().getResource("CustomerScene.fxml"));
            Scene s = new Scene(scene2Parent);
          
            
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            window.setScene(s);
            window.show();
        
        
       
    }

   
    }
    

