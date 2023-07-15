
package javafxapplication4;

import java.io.Serializable;
import javafx.fxml.Initializable;


public  class Payment implements Serializable  {
    
    protected int id,PhoneNo;
    protected String name,TrxID;

    public Payment(int id, int PhoneNo, String name, String TrxID) {
        this.id = id;
        this.PhoneNo = PhoneNo;
        this.name = name;
        this.TrxID = TrxID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(int PhoneNo) {
        this.PhoneNo = PhoneNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTrxID() {
        return TrxID;
    }

    public void setTrxID(String TrxID) {
        this.TrxID = TrxID;
    }


    
    
    
}
