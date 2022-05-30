package com.techelevator;

public class Employee {
// attributes

    private int employeeId;
    private String firstName = "";
    private String lastName = "";
    private String fullName = "";
    private String department = "";
    private double annualSalary;


//constructor
public Employee (int employeeId, String firstName, String lastName, double salary) {
    this.employeeId = employeeId;
    this.firstName = firstName;
    this.lastName = lastName;
    annualSalary = salary;
    fullName = lastName + ", " + firstName;
}

//derived attribute

     //* @return the lastName

    public String getLastName() {
        return lastName;
    }

     // @param lastname the lastName to set

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getFullName() {
        return fullName;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }


//getter and setter

    public void raiseSalary (double percent) {
        double percentAsDecimal = percent / 100;
        annualSalary = annualSalary * (1 + percentAsDecimal);

    }

}