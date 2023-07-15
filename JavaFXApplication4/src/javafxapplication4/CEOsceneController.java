
package javafxapplication4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import static java.util.Collections.list;
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
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class CEOsceneController extends FreeLancerSceneController implements Initializable {



    @FXML
    private BorderPane CeoBorderPane;


@Override
public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    private void CeoLogOutBttonClick(ActionEvent event) throws IOException {
        
         Parent scene2Parent = FXMLLoader.load(getClass().getResource("FXMLlMainScene.fxml"));
            Scene s = new Scene(scene2Parent);
          
            
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            window.setScene(s);
            window.show();
    }

     private void loadCoeMultiScenes(String ui) {
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource(ui+".fxml"));
            CeoBorderPane.setCenter(root);
        } catch (IOException ex) {
            Logger.getLogger(CEOsceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    
    
    @FXML
    private void LaodProgressOfFreelancerButton(ActionEvent event) {
  
        loadCoeMultiScenes("LaodProgressOfFreelancerScene") ; 
    }

    @FXML
    private void LaodProgressOfCompanyButton(ActionEvent event) {
        
         loadCoeMultiScenes("LaodProgressOfCompanyScene") ; 
    }

    @FXML
    private void LoadPaymentButton(ActionEvent event) {
        
         loadCoeMultiScenes("LoadPaymentScene") ; 
    }

    @FXML
    private void LoaadFeedBackButton(ActionEvent event) {
       loadCoeMultiScenes("LoaadFeedBackScene") ; 
    }

   

    @FXML
    private void ViewChartButton(ActionEvent event) {
        
        loadCoeMultiScenes("LaodChartScene");
    }
    
     @FXML
    private void ClearViewOfCeoButton(ActionEvent event) throws IOException {
        
      Parent scene2Parent = FXMLLoader.load(getClass().getResource("CEOscene.fxml"));
            Scene s = new Scene(scene2Parent);
          
            
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            window.setScene(s);
            window.show();
    }
}


   




