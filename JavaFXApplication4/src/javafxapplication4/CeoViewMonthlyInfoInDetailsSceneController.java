
package javafxapplication4;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;


public class CeoViewMonthlyInfoInDetailsSceneController implements Initializable {
    private Employee emp;
    @FXML
    private Label monthLvlFxid;
    @FXML
    private Label newUSerLvlFxid;
    @FXML
    private Label AccDelLvlFxid;
    @FXML
    private Label CusRegLvlFxid;
    @FXML
    private Label FreLancerLvlFxid;
    @FXML
    private Label InvestLvlFxid;
    @FXML
    private Label ProfitLvlFxid;
    @FXML
    private Label OrdrGotLvlFxid;
    @FXML
    private Label OrderDeliveredLvlFxid;

   
   
      public void initData(Employee Emp){
        emp = Emp;
        
       monthLvlFxid.setText(emp.getMonth());
       newUSerLvlFxid.setText(Integer.toString(emp.getNewUserV()));
       AccDelLvlFxid.setText(Integer.toString(emp.getDeletedAcc()));
       CusRegLvlFxid.setText(Integer.toString(emp.getCusReg()));
       FreLancerLvlFxid.setText(Integer.toString(emp.getFreelancerReg()));
       InvestLvlFxid.setText(emp.getInvest());
       ProfitLvlFxid.setText(emp.getProfit());
       OrdrGotLvlFxid.setText(Integer.toString(emp.getOrdrGot()));
       OrderDeliveredLvlFxid.setText(Integer.toString(emp.getOrdrDelivered()));
        
        
    }
      
     
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
   

    }    

    @FXML
    private void GoBAckButton(ActionEvent event) throws IOException {
        
                            Parent scene2Parent = FXMLLoader.load(getClass().getResource("CEOscene.fxml"));
            Scene s = new Scene(scene2Parent);
          
            
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            window.setScene(s);
            window.show();
    }
    
}
