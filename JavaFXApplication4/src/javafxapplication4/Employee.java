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
public class Employee implements Serializable{
    protected String Month, Invest, Profit;
    protected int  NewUserV, CusReg,FreelancerReg,DeletedAcc, ordrGot, ordrDelivered;

    public Employee(String Month, String Invest, String Profit, int NewUserV, int CusReg, int FreelancerReg, int DeletedAcc, int ordrGot, int ordrDelivered) {
        this.Month = Month;
        this.Invest = Invest;
        this.Profit = Profit;
        this.NewUserV = NewUserV;
        this.CusReg = CusReg;
        this.FreelancerReg = FreelancerReg;
        this.DeletedAcc = DeletedAcc;
        this.ordrGot = ordrGot;
        this.ordrDelivered = ordrDelivered;
    }

    public String getMonth() {
        return Month;
    }

    public void setMonth(String Month) {
        this.Month = Month;
    }

    public String getInvest() {
        return Invest;
    }

    public void setInvest(String Invest) {
        this.Invest = Invest;
    }

    public String getProfit() {
        return Profit;
    }

    public void setProfit(String Profit) {
        this.Profit = Profit;
    }

    public int getNewUserV() {
        return NewUserV;
    }

    public void setNewUserV(int NewUserV) {
        this.NewUserV = NewUserV;
    }

    public int getCusReg() {
        return CusReg;
    }

    public void setCusReg(int CusReg) {
        this.CusReg = CusReg;
    }

    public int getFreelancerReg() {
        return FreelancerReg;
    }

    public void setFreelancerReg(int FreelancerReg) {
        this.FreelancerReg = FreelancerReg;
    }

    public int getDeletedAcc() {
        return DeletedAcc;
    }

    public void setDeletedAcc(int DeletedAcc) {
        this.DeletedAcc = DeletedAcc;
    }

    public int getOrdrGot() {
        return ordrGot;
    }

    public void setOrdrGot(int ordrGot) {
        this.ordrGot = ordrGot;
    }

    public int getOrdrDelivered() {
        return ordrDelivered;
    }

    public void setOrdrDelivered(int ordrDelivered) {
        this.ordrDelivered = ordrDelivered;
    }

 
    
    
}
