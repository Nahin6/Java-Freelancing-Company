
package javafxapplication4;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;


public class LaodProgressOfFreelancerSceneController implements Initializable {

    @FXML
    private TableView<Freelancer> TableForFreelancer;
    @FXML
    private TableColumn<Freelancer, String> IdColumnf;
    @FXML
    private TableColumn<Freelancer, String> NameColumnf;
    @FXML
    private TableColumn<Freelancer, String> emailColumnf;
    @FXML
    private TableColumn<Freelancer, String> GotOrderColumnf;
    @FXML
    private TableColumn<Freelancer, String> deliveryColumnf;
    @FXML
    private TableColumn<Freelancer, String> SuccessRateColumnf;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
         IdColumnf.setCellValueFactory(new PropertyValueFactory<Freelancer, String>("id"));
         NameColumnf.setCellValueFactory(new PropertyValueFactory<Freelancer, String>("name"));
         emailColumnf.setCellValueFactory(new PropertyValueFactory<Freelancer, String>("email"));
         GotOrderColumnf.setCellValueFactory(new PropertyValueFactory<Freelancer, String>("OrderNum"));
         deliveryColumnf.setCellValueFactory(new PropertyValueFactory<Freelancer, String>("OrderDelivered"));
         SuccessRateColumnf.setCellValueFactory(new PropertyValueFactory<Freelancer, String>("SuccessRate"));
    }    

    @FXML
    private void FreeLancerWorkRateCheckButton(ActionEvent event) {
        
            ObjectInputStream seeWorkRate=null;
            ObservableList<Freelancer> free = FXCollections.observableArrayList();
       try {
            Freelancer fl;
            seeWorkRate = new ObjectInputStream(new FileInputStream("freelancerProgress.bin"));
            while(true){
            fl = (Freelancer) seeWorkRate.readObject();
            free.add(fl);
            }
        } catch (Exception ex) {            
            try {
                TableForFreelancer.setItems(free);
                if(seeWorkRate!=null)
                 seeWorkRate.close();
            } 
            catch (IOException e) {
                e.printStackTrace();
            }
            ex.printStackTrace();
        }
    }
    
}
