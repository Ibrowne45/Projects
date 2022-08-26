/*********************************************************************
 Author    : Immanuel Browne
 Course    : COP 3804
 Professor : Michael Robinson
 Program   : browneISuperPgm3
             Program Purpose/Description
             { Using Inheritance / Super Classes / Drivers }

 Due Date  : 07/02/2022


 Certification:
 I hereby certify that this work is my own and none of it is the work of any other person.

 ..........{ Immanuel Browne }..........
*********************************************************************/

class browneIinitialInterfaceDriver2 implements browneIinitialInterface
{

    //public static String School = "FIU"; 

    public static String personPanterID = "6221337";
    
    public static String personLastName = "Browne";
    
    public static String personFirstName = "Immanuel";

    public static String School = "FIU";    

    public void thePersonSchool( String schools)
    {
    
       System.out.printf("%s %n", schools);

    }

    public void thePersonPantherID( String idNum )
    {

      System.out.printf("%s %n", idNum);

    }

    public void thePersonLastName( String lName )
    {
 
       System.out.printf("%s %n", lName);

    }

    public void thePersonFirstName( String fName )
    {

        System.out.printf("%s %n", fName);

    }  

 
    public static void main( String args[] )
    {
        browneIinitialInterfaceDriver2 con = new browneIinitialInterfaceDriver2();  

        con.thePersonSchool(School);

        con.thePersonPantherID(personPanterID);

        con.thePersonLastName(personLastName);

        con.thePersonFirstName(personFirstName);

     
    }

}


