
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


public class EmployeeSceneController implements Initializable {

    @FXML
    private BorderPane EmployeeBorderPane;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    

    @FXML
    private void EpmloyeeLogOutBttonClick(ActionEvent event) throws IOException {
        
        
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("FXMLlMainScene.fxml"));
            Scene s = new Scene(scene2Parent);
          
            
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            window.setScene(s);
            window.show();
    }
    
      private void loadEmployeeMultiScenes(String ui) {
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource(ui+".fxml"));
            EmployeeBorderPane.setCenter(root);
        } catch (IOException ex) {
            Logger.getLogger(EmployeeSceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
      }

    @FXML
    private void SendMonthlyUpdateButtonClick(ActionEvent event) {
        
          loadEmployeeMultiScenes   ("EmployeeSendMonthlyUpdateScene") ;
    }

    @FXML
    private void ViewCusListButtonClick(ActionEvent event) {
        
          loadEmployeeMultiScenes   ("EmployeeViewCustomerListScene") ;
    }

    @FXML
    private void GuideCustomerButtonClick(ActionEvent event) {
        
          loadEmployeeMultiScenes   ("EmployeeGuideCustomerScene") ;
    }

    @FXML
    private void UpdateChartButtonClick(ActionEvent event) {
        
          loadEmployeeMultiScenes   ("EmployeeUpdateChartScene") ;
    }

    @FXML
    private void LeaveApplicationButtonClick(ActionEvent event) {
        
    loadEmployeeMultiScenes   ("EmployeeLeaveApplicationScene") ;
    }

    @FXML
    private void ClearEmpViewButtonClick(ActionEvent event) throws IOException {
        
          Parent scene2Parent = FXMLLoader.load(getClass().getResource("EmployeeScene.fxml"));
            Scene s = new Scene(scene2Parent);
          
            
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            window.setScene(s);
            window.show();
    }

    
}
