package com.mycompany.agency;



    // TODO 1: Make Intern a child of StaffEmploee


/*
 * 
 * @author Owen Wurster
 */
public class Intern extends StaffMember {

    public Intern(String eName, String eAddress, String ePhone) {
        super(eName, eAddress, ePhone);
    }

    /*
     * Returns the Intern's pay
     * @return 0
     */
    @Override
    public double pay() {
      return 0;
    }
}