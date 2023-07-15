

package javafxapplication4;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;


public class ForgetPassWordController implements Initializable {

    public Label label;
  
    @FXML
    private Button button;
    @FXML
    private Button back;
    @FXML
    private TextField ForgetPassFxId;
    
    @FXML
    private void SendButtonClick(ActionEvent event)throws IOException {
        
         TextInputDialog textdialog = new TextInputDialog();
        textdialog.setTitle("Recover password");
        textdialog.setHeaderText("Enter OTP");
        textdialog.setContentText("Please enter the OTP sent to your registered Email.");
     
        Optional<String> result = textdialog.showAndWait();
        if(result.isPresent()){
            
           
            Alert("OTP verified. Now you can change your Password.");
        }
        else {
           
            Alert("Cancelled Successful! ");
        }        
        

   
    }
     private void Alert(String s) {
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setContentText(s);
        a.showAndWait();    
        
        ForgetPassFxId.setText(null);
           label.setText("Password Recovery Done. Now you can login");
    }  
 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void ClickToGoBack(ActionEvent event) throws IOException {
        
        Parent GoBackParent = FXMLLoader.load(getClass().getResource("FXMLlMainScene.fxml"));
            Scene s = new Scene(GoBackParent);
          
            
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            window.setScene(s);
            window.show();
    }

 
    
}
