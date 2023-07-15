package javafxapplication4;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class FXMLDocumentController_1 implements Initializable {
    
  static  ObservableList list = FXCollections.observableArrayList();
    
    String username = "Nahin";
    String username2= "Employee";
    String username3= "Customer";
    String username4= "Freelancer";
    String username5= "BASIS";
    String password =  "1";
    String password2 = "2";
    String password3 = "3";
    String password4 = "4";
    String password5 = "5";
    
   
    static String name = null;
    
    @FXML
    private Label label;
    @FXML
    private TextField UserName;
    @FXML
    private TextField Password;
    @FXML
    private Label label1;
    @FXML
    private ComboBox ComboBox;
    @FXML
    private Button LoginTxT;
    @FXML
    private Button ForgetpassTxt;
    private Label  deptLabel;
    
 
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      ComboBox.getItems().add("CEO");
      ComboBox.getItems().addAll("Employee","Customer","FreeLancer","BASIS-Members");
      ComboBox.setValue("Select Dept");    
   
    }    
    
    public static String TakeVariable ()
    {
    return name;
    }
  
      @FXML
    private void UpdateComboBox(ActionEvent event) {
        this.deptLabel.setText("Selected Dept is: "+ ComboBox.getValue().toString());
    }


    @FXML
    private void ClickToLogin(ActionEvent event) throws IOException {
        
        String n= UserName.getText();
        String pass =Password.getText();
        if(n.isEmpty()&& pass.isEmpty())
        {
            Alert alert = new Alert (AlertType.ERROR);
            alert.setHeaderText("Fileds are Empty ");
            alert.showAndWait();
        }
        else if(n.equals(username)&&pass.equals(password)&&ComboBox.getValue().equals("CEO"))
            
            
        { 
   

                FXMLDocumentController_1.name= n;
               ((Node)event.getSource()).getScene().getWindow().hide();
                NewWindow ("CEOscene.fxml","CEO Sir View") ;  
                
     
            }
              else if (n.equals(username2)&&pass.equals(password2)&&ComboBox.getValue().equals("Employee"))
                        {
                            
                            FXMLDocumentController_1.name= n;
               ((Node)event.getSource()).getScene().getWindow().hide();
                NewWindow ("EmployeeScene.fxml","Employee View") ;
                        }
            else if (n.equals(username3)&&pass.equals(password3)&&ComboBox.getValue().equals("Customer"))
                        {
                            FXMLDocumentController_1.name= n;
               ((Node)event.getSource()).getScene().getWindow().hide();
                NewWindow ("CustomerScene.fxml","Customer View") ;
                        }
            
                 else if (n.equals(username4)&&pass.equals(password4)&&ComboBox.getValue().equals("FreeLancer"))
                        {
                            FXMLDocumentController_1.name= n;
               ((Node)event.getSource()).getScene().getWindow().hide();
                NewWindow ("FreeLancerScene.fxml","Free Lancer View") ;
            
                        }
                    else if (n.equals(username5)&&pass.equals(password5)&&ComboBox.getValue().equals("BASIS-Members"))
                        {
                            FXMLDocumentController_1.name= n;
               ((Node)event.getSource()).getScene().getWindow().hide();
                NewWindow ("BASISmemberScene.fxml","BASIS Members View") ;
                        }
                    
             
            else{
                
                Alert alert = new Alert (AlertType.ERROR);
            alert.setHeaderText("Incorrect User Name or Password or Missing Designation ");
            alert.showAndWait();
            }

    }
    
    
private void NewWindow (String location, String title)  throws IOException {


           Parent scene2Parent = FXMLLoader.load(getClass().getResource(location));
           Scene scene = new Scene(scene2Parent);
           Stage stage = new Stage(StageStyle.DECORATED);
            stage.setScene(scene);
      stage.setTitle(title);
            stage.show();
}


    @FXML
   private void ClickToForgetpassword(ActionEvent event)throws IOException {
       
       Alert alert = new Alert (AlertType.CONFIRMATION);
            alert.setHeaderText("      Are you sure?!! ");
          
            
            Optional<ButtonType> result = alert.showAndWait();
             if(result.get() == ButtonType.OK)
           
             {
                     
               Parent ForgetpassceneParent = FXMLLoader.load(getClass().getResource("ForgetPassWord.fxml"));
            Scene s = new Scene(ForgetpassceneParent);
          
            
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            window.setScene(s);
            window.show();
         
        }
        else{
   
            showCustomInformationAlert("cancelled!"); 
                      Parent ForgetpassceneParent = FXMLLoader.load(getClass().getResource("FXMLlMainScene.fxml"));
            Scene s = new Scene(ForgetpassceneParent);
          
            
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            window.setScene(s);
            window.show();
        

    }
             

}


  private void showCustomInformationAlert(String alt) {
        Alert warning = new Alert(Alert.AlertType.INFORMATION);
        warning.setContentText(alt);
        warning.showAndWait();         
    } 

}



