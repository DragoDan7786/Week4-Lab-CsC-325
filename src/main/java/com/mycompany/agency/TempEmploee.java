package com.mycompany.agency;



    // TODO 1: Make TempEmploee a child of StaffEmploee

public class TempEmploee extends StaffEmployee
{
    private int hoursWorked;

    //-----------------------------------------------------------------
    //  Constructor: Sets up this hourly employee using the specified
    //  information.
    //-----------------------------------------------------------------
    public TempEmploee(String eName, String eAddress, String ePhone,
            String socSecNumber, double rate)
    {
        super(eName, eAddress, ePhone, socSecNumber, rate);

        hoursWorked = 0;
    }

    //-----------------------------------------------------------------
    // TODO2: Adds the specified number of hours to this employee's
    //  accumulated hours.
    //-----------------------------------------------------------------
    public void addHours(int moreHours)
    {
        this.hoursWorked += moreHours;//adds more hours to the total hours worked 
    }

    //-----------------------------------------------------------------
    // TODO3: Computes and returns the pay for this hourly employee.
    //-----------------------------------------------------------------
    public double pay()
    {
       double p = super.payRate;//gets the payrate from the parent class then...
       
       return p * hoursWorked;//computes and returns the pay 
    }

    //-----------------------------------------------------------------
    // TODO4: Returns information about this hourly employee as a string.
    //-----------------------------------------------------------------
    public String toString()
    {
        String str = super.toString() + ", Also, this employee worked: " + hoursWorked + " And got paid: " + pay() + "$";//string that lists off information about the user 
        return str;
    }
}
