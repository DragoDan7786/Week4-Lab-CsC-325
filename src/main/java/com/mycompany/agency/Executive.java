package com.mycompany.agency;


/**
 * 
 * @author Owen Wurster
 */
public class Executive extends StaffEmployee {
    private double bonus;

    public Executive(String eName, String eAddress, String ePhone,
            String socSecNumber, double rate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);

        this. bonus = 0;  // bonus has yet to be awarded
    }

    /**
     * 
     * @param execBonus 
     */
    public void awardBonus(double execBonus) {
        this.bonus = execBonus;
    }

    /**
     * 
     * @return Executive's pay
     */
    @Override
    public double pay() {
       return this.payRate + this.bonus;
    }
}
