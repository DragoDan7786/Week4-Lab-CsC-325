package com.mycompany.agency;


    // TODO 1: Make StaffEmployee a child of StaffEmploee

public class StaffEmployee extends StaffMember
{
    protected String socialSecurityNumber;
    protected double payRate;

    //-----------------------------------------------------------------
    //  TODO 2: Sets up this staff employee with the specified
    //  information. @todo Nur
    //-----------------------------------------------------------------
    public StaffEmployee(String eName, String eAddress, String ePhone,
            String socSecNumber, double rate)
    {
        super(eName, eAddress, ePhone);
        socialSecurityNumber = socSecNumber;
        payRate = rate;
    }

    //-----------------------------------------------------------------
    // TODO 3: complete the implementation of toString to return information 
    //          about a staff employee as a string.
    //-----------------------------------------------------------------
    @Override
    public String toString()
    {
        return "Name: " + this.name + "\n" +
                "Address: " + this.address + "\n" +
                "Phone: " + this.phone + "\n" +
                "Social Security Number: " + this.socialSecurityNumber + "\n" +
                "Pay Rate: " + this.payRate + "\n";
    }

    //-----------------------------------------------------------------
    // TODO 4:  Returns the pay rate for this staff employee.
    //-----------------------------------------------------------------
    public double pay()
    {
       return payRate;
    }
}
