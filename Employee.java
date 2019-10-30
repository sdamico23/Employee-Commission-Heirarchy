/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Steve
 */
public class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private CompensationModel compensationModel;
    
    //constructor
    public Employee(String first, String last, String ssn, CompensationModel compModel){
        firstName = first;
        lastName = last;
        socialSecurityNumber = ssn;
        compensationModel = compModel;    
    }
    //setCompModel
    public void setCompensation(CompensationModel compModel) {
        this.compensationModel = compModel;         
    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName( String first){
        this.firstName = first;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName( String last){
        this.lastName = last;
    }
    public String getSocialSecurityNumber(){
        return socialSecurityNumber;
    }
    public void setSocialSecurityNumber(String ssn){
        this.socialSecurityNumber = ssn;
    }
    public double earnings(){
        return compensationModel.earnings();
    }
    
    public CompensationModel getCompensation() {
        return compensationModel;
    }
    public void raise(double percent){
       getCompensation().raise(percent);
    }
    @Override
    public String toString() {
        return String.format("%s %s%nsocial security number: %s%n%s", firstName, lastName, socialSecurityNumber, compensationModel.toString());    
    }   
    public static void main(String[] args) {
   // Create the four employees with their compensation models.
       
        CommissionCompensationModel commissionModel = new CommissionCompensationModel(2000.00, 0.04);
        BasePlusCommissionCompensationModel basePlusCommissionModel = new BasePlusCommissionCompensationModel(2000.00, 0.05, 600.00);
        SalariedCompensationModel salariedCompensationModel = new SalariedCompensationModel(2500.00);
        HourlyCompensationModel hourlyCommissionModel = new HourlyCompensationModel(10.00, 35.0);
       
        Employee employee1 = new Employee("John", "Smith", "111-11-1111", commissionModel);
        Employee employee2 = new Employee("Sue", "Jones", "222-22-2222", basePlusCommissionModel);
        Employee employee3 = new Employee("Jim", "Williams", "333-33-3333", salariedCompensationModel);
        Employee employee4 = new Employee("Nancy", "Johnson", "444-44-4444", hourlyCommissionModel);
       
        // Print the information about the four employees.
        System.out.println("The employee information initially.");
        System.out.printf("%s%n%s%n%s%n%s%n", employee1, employee2, employee3, employee4);
        System.out.printf("%s%s%s%s%s%8.2f%n%n", "Earnings for ", employee1.getFirstName(), " ", employee1.getLastName(), ": ", employee1.earnings());
       
        // Change the compensation model for the four employees.
       
        CommissionCompensationModel commissionModelNew = new CommissionCompensationModel(5000.00, 0.04);
        BasePlusCommissionCompensationModel basePlusCommissionModelNew = new BasePlusCommissionCompensationModel(4000.00, 0.05, 800.00);
        SalariedCompensationModel salariedCompensationModelNew = new SalariedCompensationModel(3500.00);
        HourlyCompensationModel hourlyCommissionModeNewl = new HourlyCompensationModel(10.00, 50);
       
        // Set the new compensation models for the employees.
        employee1.setCompensation(basePlusCommissionModelNew);
        employee2.setCompensation(commissionModelNew);
        employee3.setCompensation(hourlyCommissionModeNewl);
        employee4.setCompensation(salariedCompensationModelNew);
       
        // Print out the new information for the four employees.
        System.out.println("The employee information after changing compensation models.");
        System.out.printf("%s%n%s%n%s%n%s%n", employee1, employee2, employee3, employee4);
       
        // Declare an array of employees and assign the four employees to it.
        Employee[] employees = new Employee[4];
        employees[0] = employee1;
        employees[1] = employee2;
        employees[2] = employee3;
        employees[3] = employee4;
    
        // Loop thru the array giving each employee a 2% raise polymorphically;
        for (Employee employee : employees)
        {
            employee.raise(.02);
        }
       
        // Print out their new earnings.
        System.out.println("The employee information after raises of 2 percent.");
        System.out.printf("%s%n%s%n%s%n%s%n", employee1, employee2, employee3, employee4);
    }
}


