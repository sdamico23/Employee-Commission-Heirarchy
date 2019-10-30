/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pete
 */

public class SalariedCompensationModel extends CompensationModel{
    double weeklySalary;
    
    public SalariedCompensationModel(double weekSal){
        weeklySalary = weekSal;
    }
    public Double getweeklySalary(){
        return weeklySalary;
    }
    public void setcommissionRate(Double wSalary){
        this.weeklySalary = wSalary;
    }
    @Override
    public double earnings(){
        return weeklySalary;
    }
    @Override
    public void raise(double percent){
        weeklySalary = weeklySalary*(1+percent);
        
    }
    @Override
    public String toString(){
      return String.format("Salaried Compensation with:%nWeekly Salary of: %f%nEarnings: %f", weeklySalary, earnings()); 
}
}
