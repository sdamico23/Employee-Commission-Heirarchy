/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Steve
 */
public class CommissionCompensationModel extends CompensationModel{
    public double grossSales;
    public double commissionRate;
    
    //constructor
    public CommissionCompensationModel(double gSales, double comRate){
        grossSales = gSales;
        commissionRate = comRate;          
    }
    @Override
    public double earnings(){
        return grossSales*commissionRate;       
    }
    @Override
    public void raise(double percent){
        commissionRate = commissionRate*(1+percent);
    }
    public double getGrossSales(){
        return grossSales;
    }
    public void setGrossSales( Double gSales){
        this.grossSales = gSales;
    }
    public double getCommissionRate(){
        return commissionRate;
    } 
    public void setcommissionRate(Double comRate){
        this.commissionRate = comRate;
    }
    @Override
    public String toString(){
        return String.format("Commission Compensation with:%nGross Sales of: %f%nCommission Rate of: %f%nEarnings: %f", grossSales, commissionRate, earnings());
    }
}

        