
package javafxapplication4;

import java.io.Serializable;


public class Customer  implements Serializable {
    protected int id;
    protected String name;
    protected String problemSubject,SendComplain;

    public Customer(int id, String name, String problemSubject, String SendComplain) {
        this.id = id;
        this.name = name;
        this.problemSubject = problemSubject;
        this.SendComplain = SendComplain;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProblemSubject() {
        return problemSubject;
    }

    public void setProblemSubject(String problemSubject) {
        this.problemSubject = problemSubject;
    }

    public String getSendComplain() {
        return SendComplain;
    }

    public void setSendComplain(String SendComplain) {
        this.SendComplain = SendComplain;
    }


    
}
