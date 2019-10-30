/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Steve
 */
public class BasePlusCommissionCompensationModel extends CommissionCompensationModel{
    private double baseSalary;
    
    //constructor
    public BasePlusCommissionCompensationModel(double grossSales, double commissionRate, double bSalary){
        super(grossSales, commissionRate);
        baseSalary = bSalary;
    }
    public Double getBaseSalary(){
        return baseSalary;
    }
    public void setBaseSalary( Double bSalary){
        this.baseSalary = bSalary;
    }
    @Override
    public void raise(double percent){
        baseSalary = baseSalary*(1+percent);
    }
    @Override
    public double earnings(){
        return super.earnings()+baseSalary;
    }
    @Override
    public String toString(){
      return String.format("Base Plus Commission Compensation with:%nGross Sales of: %f%nCommission Rate of: %f%nBase Salary of: %f%nEarnings: %f", grossSales, commissionRate, baseSalary, earnings()); 
    }
    
  
}
