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
        staffList[1] = new Intern("Jason" , "54 East Drive" , "347-556-8594");
        staffList[2] = new StaffEmployee("Nicholas" , "85 Cage Road" , "516-598-0020" , "180-65-2002" , 20.0);
        staffList[3] = new TempEmploee("Miller" , "56 South Drive" , "347-777-1324" , "180-56-9898" , 15.0);
        staffList[4] = new Executive("Isaac" , "75 Miller Ave" , "347-654-1234" , "210-45-6547" , 40.0);
        staffList[5] = new StaffEmployee("Susan" , "120 North Drive" , "631-201-4321" , "121-99-3212" , 30.0);
        
        ((Executive)staffList[0]).awardBonus(500.00);
        ((TempEmploee)staffList[3]).addHours(40);
        
        ((Executive)staffList[4]).awardBonus(1000.00);
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
