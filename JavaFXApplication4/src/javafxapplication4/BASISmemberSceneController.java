
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
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class BASISmemberSceneController implements Initializable {

    @FXML
    private BorderPane BasisBorderPane;

   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void BasisLogOutBttonClick(ActionEvent event) throws IOException {
        
                    Parent scene2Parent = FXMLLoader.load(getClass().getResource("FXMLlMainScene.fxml"));
            Scene s = new Scene(scene2Parent);
          
            
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            window.setScene(s);
            window.show();
    }
    
     private void loadBASISmemberMultiScenes(String ui) {
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource(ui+".fxml"));
            BasisBorderPane.setCenter(root);
        } catch (IOException ex) {
            Logger.getLogger(BASISmemberSceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }


    @FXML
    private void ApplyForMembershipButtonOnCLick(ActionEvent event) {
        
        loadBASISmemberMultiScenes("LoadApplyPaidMembershipScene");
    }

    @FXML
    private void ViewAllservicesButtonOnClick(ActionEvent event) {
        
          loadBASISmemberMultiScenes("LoadViewAllServicesSceene");
    }

    @FXML
    private void TakePaidSevicesButtonOnClick(ActionEvent event) {
        
          loadBASISmemberMultiScenes("LoadTakePaidServicesScene");
    }

    @FXML
    private void TakeFreeServicesButtonOnClick(ActionEvent event) {
        
          loadBASISmemberMultiScenes("LoadTakeFreeServicesScene");
    }

    @FXML
    private void ViewPaidMemberListButtonOnClick(ActionEvent event) {
        
          loadBASISmemberMultiScenes("LaodViewPaidMemberList");
    }

    @FXML
    private void ClearBASISview(ActionEvent event) throws IOException {
        
                Parent scene2Parent = FXMLLoader.load(getClass().getResource("BASISmemberScene.fxml"));
            Scene s = new Scene(scene2Parent);
          
            
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            window.setScene(s);
            window.show();
        
        
    }
    }
    