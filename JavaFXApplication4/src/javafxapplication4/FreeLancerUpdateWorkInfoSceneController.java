
package javafxapplication4;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;


public class FreeLancerUpdateWorkInfoSceneController implements Initializable {

    @FXML
    private TextField IdTxt;
    @FXML
    private TextField NameTxt;
    @FXML
    private TextField EmailTxt;
    @FXML
    private TextField WorkGotTxt;
    @FXML
    private TextField DeliveredTxt;
    @FXML
    private TextField SuccessRateTxt;
    @FXML
    private Label storeMsgFxId;

   
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }    

    @FXML
    private void StoreInfoButtonClick(ActionEvent event) {
        
         Freelancer freelancer = new Freelancer( 
                 
                    Integer.parseInt(IdTxt.getText()),
                    NameTxt.getText(),
                    EmailTxt.getText(),
                    Integer.parseInt(WorkGotTxt.getText())  ,
                    Integer.parseInt(DeliveredTxt.getText()),
                    
                    SuccessRateTxt.getText()
                      
              
                );
        IdTxt.setText(null);    NameTxt.setText(null);  EmailTxt.setText(null);  
        
        WorkGotTxt.setText(null);
                
        DeliveredTxt.setText(null); SuccessRateTxt.setText(null);
      
        File f = new File("freelancerProgress.bin");
        ObjectOutputStream oos=null;
        try {
            if(f.exists())
               oos = new AppendableObjectOutputStream(new FileOutputStream(f,true));
           else
               oos = new ObjectOutputStream(new FileOutputStream(f,true));
          
         
          oos.writeObject(freelancer);
            oos.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        storeMsgFxId.setText("Information Stored Successfully" );

    }
    
}
