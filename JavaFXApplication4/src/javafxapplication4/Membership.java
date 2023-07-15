
package javafxapplication4;

import java.io.Serializable;
import java.time.LocalDate;


public class Membership   implements Serializable{
    
    protected int id,contractNo;
    protected String name,mail,adress;
      protected  LocalDate dateOfApply;

    public Membership(int id, int contractNo, String name, String mail, String adress, LocalDate dateOfApply) {
        this.id = id;
        this.contractNo = contractNo;
        this.name = name;
        this.mail = mail;
        this.adress = adress;
        this.dateOfApply = dateOfApply;
    }

    Membership(int parseInt, int parseInt0, String string, String text, String text0, LocalDate value, Object value0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getContractNo() {
        return contractNo;
    }

    public void setContractNo(int contractNo) {
        this.contractNo = contractNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public LocalDate getDateOfApply() {
        return dateOfApply;
    }

    public void setDateOfApply(LocalDate dateOfApply) {
        this.dateOfApply = dateOfApply;
    }
      
      
   
    
}
