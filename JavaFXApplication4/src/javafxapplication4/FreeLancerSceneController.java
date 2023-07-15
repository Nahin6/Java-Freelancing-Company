
package javafxapplication4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class FreeLancerSceneController implements Initializable {


    @FXML
    private BorderPane FreelancerBorderPane;

   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
    }    


      @FXML
    private void FreeLancerLogOutBttonClick(ActionEvent event) throws IOException {
        
          Parent scene2Parent = FXMLLoader.load(getClass().getResource("FXMLlMainScene.fxml"));
            Scene s = new Scene(scene2Parent);
          
            
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            window.setScene(s);
            window.show();
    }

    
       private void loadFreelancerMultiScenes(String ui) {
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource(ui+".fxml"));
            FreelancerBorderPane.setCenter(root);
        } catch (IOException ex) {
            Logger.getLogger(CustomerSceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
      }
  
    @FXML
    private void UpdateWorkInfoButtonClick(ActionEvent event) {
        
     loadFreelancerMultiScenes   ("FreeLancerUpdateWorkInfoScene");
        
    }

    @FXML
    private void PostAddButtonClick(ActionEvent event) {
        
         loadFreelancerMultiScenes   ("FreelancerPostAddScene");
    }

    @FXML
    private void ViewJobReqButtonClick(ActionEvent event) {
        
         loadFreelancerMultiScenes   ("FreelancerViewJobReqScene");
    }

    @FXML
    private void SubmitProjectButtonClick(ActionEvent event) {
        
         loadFreelancerMultiScenes   ("FreelancerSubmitProjectScene");
    }

    @FXML
    private void CheckPaymentFromCusButtonClick(ActionEvent event) {
        
         loadFreelancerMultiScenes   ("FreelancerCheckPayStatsFromCustomer");
    }

    @FXML
    private void ClearViewOfFreelancerButtonClick(ActionEvent event) throws IOException {
        
               Parent scene2Parent = FXMLLoader.load(getClass().getResource("FreeLancerScene.fxml"));
            Scene s = new Scene(scene2Parent);
          
            
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            window.setScene(s);
            window.show();
        
    }



    
        } 
    

