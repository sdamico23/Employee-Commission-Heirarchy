/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pete
 */
public class HourlyCompensationModel extends CompensationModel{
    double wage;
    double hours;
    
    public HourlyCompensationModel(double wage1, double hours1) {
        wage = wage1;
        hours = hours1;   
    }
        public double getWage(){
        return wage;
    }
    public void setWage(Double wages){
        this.wage = wages;
    }
    public double getHours(){
        return hours;
    }
    public void setHours(Double hours1){
        this.hours = hours1;
    }
    @Override
    public double earnings(){
        if (hours>40) {
            double extra = hours-40;
            return (extra*1.5*wage)+(40*wage);
        }
        else{
            return hours*wage;
        }
        }  
    
    @Override
    public void raise(double percent){
        wage = wage*(1+percent);
    }
    @Override
    public String toString(){
      return String.format("Hourly Compensation with:%nWage of: %f%nHours Worked of: %f%nEarnings: %f", wage, hours, earnings()); 
    } 
}
