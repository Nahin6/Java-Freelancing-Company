/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication4;

import java.io.Serializable;

/**
 *
 * @author Acer
 */
public class Freelancer  implements Serializable {
    protected int id;
    protected String name;
    protected String email;
    protected int OrderNum;
    protected int OrderDelivered;
    protected String SuccessRate;

    public Freelancer(int id, String name, String email, int OrderNum, int OrderDelivered, String SuccessRate) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.OrderNum = OrderNum;
        this.OrderDelivered = OrderDelivered;
        this.SuccessRate = SuccessRate;
    }

    
     public void submitReport(){}
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

  //  public void setId(int id) {
      //  this.id = id;
  //  }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getOrderNum() {
        return OrderNum;
    }

    public void setOrderNum(int OrderNum) {
        this.OrderNum = OrderNum;
    }

    public int getOrderDelivered() {
        return OrderDelivered;
    }

    public void setOrderDelivered(int OrderDelivered) {
        this.OrderDelivered = OrderDelivered;
    }

    public String getSuccessRate() {
        return SuccessRate;
    }

    public void setSuccessRate(String SuccessRate) {
        this.SuccessRate = SuccessRate;
    }

  

    
    
}
