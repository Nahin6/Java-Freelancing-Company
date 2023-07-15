
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
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;


public class LaodProgressOfCompanySceneController implements Initializable {

    @FXML
    private TableView<Employee> tableFromEmployee;
    @FXML
    private TableColumn<Employee, String> monthColumnE;
    @FXML
    private TableColumn<Employee, String> NewVisitedColumnE;
    @FXML
    private TableColumn<Employee, String> NewCusRegColumnE;
    @FXML
    private TableColumn<Employee, String> NewFreelancerRegColumnE;
    @FXML
    private TableColumn<Employee, String> DeletedAccColumnE;
    @FXML
    private TableColumn<Employee, String> InvestColumnE;
    @FXML
    private TableColumn<Employee, String> ProfitColumnE;
    @FXML
    private TableColumn<Employee, String> orderGotColumnE;
    @FXML
    private TableColumn<Employee, String> OrderDeliverdColumnE;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
      
  
  
         monthColumnE.setCellValueFactory(new PropertyValueFactory<Employee, String>("Month"));
         NewVisitedColumnE.setCellValueFactory(new PropertyValueFactory<Employee, String>("NewUserV"));
         NewCusRegColumnE.setCellValueFactory(new PropertyValueFactory<Employee, String>("CusReg"));
         NewFreelancerRegColumnE.setCellValueFactory(new PropertyValueFactory<Employee, String>("FreelancerReg"));
         DeletedAccColumnE.setCellValueFactory(new PropertyValueFactory<Employee, String>("DeletedAcc"));
         InvestColumnE.setCellValueFactory(new PropertyValueFactory<Employee, String>("Invest"));
         ProfitColumnE.setCellValueFactory(new PropertyValueFactory<Employee, String>("Profit"));
         orderGotColumnE.setCellValueFactory(new PropertyValueFactory<Employee, String>("ordrGot"));
         OrderDeliverdColumnE.setCellValueFactory(new PropertyValueFactory<Employee, String>("ordrDelivered"));
    }    

    @FXML
    private void CheckMonthlyUpdateButton(ActionEvent event) {
                        ObjectInputStream ois=null;
        ObservableList<Employee> emp = FXCollections.observableArrayList();
         try {
            Employee el;
            ois = new ObjectInputStream(new FileInputStream("MonthlyUpdate.bin"));
            while(true){
                el = (Employee) ois.readObject();
                emp.add(el);
            }
            
        } catch (Exception ex) {            
            try {
                tableFromEmployee.setItems(emp);
                if(ois!=null)
                    ois.close();
            } 
            catch (IOException e) {
                e.printStackTrace();
            }
            ex.printStackTrace();
        }
    }

    @FXML
    private void VIewInDetailsButtonClick(ActionEvent event) throws IOException {
        
                            
        FXMLLoader loader = new FXMLLoader();
        
        loader.setLocation(getClass().getResource("CeoViewMonthlyInfoInDetailsScene.fxml"));
       
        Parent viewMonthDetails = loader.load();
       
        Scene seeDetails = new Scene(viewMonthDetails);
        
        CeoViewMonthlyInfoInDetailsSceneController controller = loader.getController();
        
        controller.initData(tableFromEmployee.getSelectionModel().getSelectedItem());
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(seeDetails);
       
        window.show();
    }

    
}
