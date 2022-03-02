package com.mycompany.agency;




public class Staff
{
    private StaffMember[] staffList;

    //-----------------------------------------------------------------
    //  Constructor: Sets up the list of staff members.
    //-----------------------------------------------------------------
    public Staff()
    {
        staffList = new StaffMember[6];

        // TODO 1: Add 6 employees to the staffList
        
        staffList[0] = new Executive("John" , "52 West Drive" , "347-888-3454" , "120-35-9898" , 35.0);
        staffList[1] = new Executive("John" , "52 West Drive" , "347-888-3454" , "120-35-9898" , 35.0);
        staffList[2] = new Executive("John" , "52 West Drive" , "347-888-3454" , "120-35-9898" , 35.0);
        staffList[3] = new TempEmployee("Miller" , "56 South Drive" , "347-777-1324" , "180-56-9898" , 15.0);
        staffList[4] = new Executive("John" , "52 West Drive" , "347-888-3454" , "120-35-9898" , 35.0);
        staffList[5] = new Executive("John" , "52 West Drive" , "347-888-3454" , "120-35-9898" , 35.0);
        
        ((Executive)staffList[0]).awardBonus(500.00);

        ((TempEmploee)staffList[3]).addHours(40);
    }

    //-----------------------------------------------------------------
    //  Pays all staff members.
    //-----------------------------------------------------------------
    public void payday ()
    {
        double amount;

        for (int count=0; count < staffList.length; count++)
        {
            System.out.println(staffList[count]);

            amount = staffList[count].pay();  // polymorphic

            if (amount == 0.0)
                System.out.println("Thanks!");
            else
                System.out.println("Paid: " + amount);

            System.out.println("-----------------------------------");
        }
    }
}
