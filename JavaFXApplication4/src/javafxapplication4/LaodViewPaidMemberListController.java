
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


public class LaodViewPaidMemberListController implements Initializable {

    @FXML
    private TableView<Membership> TableOfBASISPAidMemberList;
    @FXML
    private TableColumn<Membership, String> NameColumnOfPaidMember;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
          NameColumnOfPaidMember.setCellValueFactory(new PropertyValueFactory<Membership, String >("name"));
        
    }    

    @FXML
    private void ViewBASISPaidMemberListButton(ActionEvent event) {
        
        ObjectInputStream ois=null;
        ObservableList<Membership> member = FXCollections.observableArrayList();
         try {
            Membership readName;
            ois = new ObjectInputStream(new FileInputStream("BASISPaidMember.bin"));
            while(true){
            readName = (Membership) ois.readObject();
            member.add(readName);
            }
          
        } catch (Exception ex) {            
            try {
               TableOfBASISPAidMemberList.setItems(member);
                if(ois!=null)
                    ois.close();
            } 
            catch (IOException e) {
                e.printStackTrace();
            }
            ex.printStackTrace();
        }
    }
    
}


