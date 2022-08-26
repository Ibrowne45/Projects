L/*********************************************************************
 Author    : Immanuel Browne
 Course    : COP3804 Intermediate Jave
 Professor : Michael Robinson 
 Program # : Parallel Arrays  
             

 Due Date  : 06/1/2022 


 Certification: 
 I hereby certify that this work is my own and none of it is the work of 
any other person. 

 ..........{ Immanuel Browne }..........
*********************************************************************/

import java.util.ArrayList;

class browneIpgm2
{

    public static void parallel() //Done may need formatting
    {
        int carsWeight[] = { 50102, 23908, 12098 };             
           
        String owner[] = { "Michael Hall", "Maria Lopez", "Mo Freeman" };
    
        double totalMiles[] = { 104.45, 232.78, 153.07 };
    
         //Accept & Display Array
         for( int x = 0; x <  carsWeight.length; x++ )
         {
          
           System.out.printf( carsWeight[x] + "%n" + owner[x] + "%n" + totalMiles[x]  );
       
         }//FOR LOOP

    }//PARALLEL Loop Done       
 
    public static void theEnhanceForLoop(int element[] )
    {
        //search the above array and display one index at the time
        for( int loop : element )
        {
        
           System.out.printf( " %s\n", loop );
        
        }
        
    }//Enhance Loop   
   
   public static void tokens()
   {
 
        //TOKEN 1:
        String str1 = "Jill$Billy%Becky*Tara&Mary";
       
        System.out.printf( "%s", str1 );

        String Token1[]  = str1.split("[$%*&]");
        
        for ( String element : Token1)
        {
            System.out.printf("%n %s  ", element );

        }//Enhanced loop        
        
        //TOKEN 2:
        String str2 = "http://gaddisbooks.com";
        
        System.out.printf( "%s", str2 );
        
        String Token2[]  = str2.split("[//]");
        
        for ( String element : Token2)
        {
            System.out.printf("%n %s  ", element );
        
        }//Enhanced loop

        //TOKEN 3: 
        String str3 = "blue one red three yellow";
        
        System.out.printf( "%s", "%n",  str3 );
        
        String Token3[]  = str3.split("[' ']");
        
        for ( String element : Token3 )
        {
            System.out.printf("%n %s  ", element );
        
        }//Enhanced loop

   }//Token Loop Done
   
   public static void theArrayList( Object theList[]) //Not Done
   {
    
       ArrayList<Object> list = new ArrayList<Object>();       
  
       int x = 0;

       for(x = 0; x < theList.length; x++)
       {

           list.add(theList[x]);
               
       }

       for( x = 0; x < theList.length; x++)
       {

           System.out.printf("%s  ", list.get(x)); //Display all Data

       }//For
 
      //Remove
      //list.remove(4);
     
      //list.remove(1);
     
      for( x = 0; x < theList.length; x++)
      {
         
          System.out.printf("%n %s ",  list.get(x));

      }//FOR

   }//Array Lists

   public static void theObjects() //Done
   {
       Object arrayObjects[] = {1, "one", 1.4, 0.25, "COP2250", "Java Language", 100}; 
      
       ArrayList<Object> list = new ArrayList<Object>();
       
       int x = 0;
 
       for(x = 0; x < arrayObjects.length; x++)
       {
        
           list.add(arrayObjects[x]);
        
       }
        
       for( x = 0; x < arrayObjects.length; x++)
       {
    
           System.out.printf("%s  ", list.get(x)); //Display all Data

       }//For
      
      for( x = 0; x < arrayObjects.length; x++)
      {    
           
           System.out.printf("%n %s ",  list.get(x));
      
      }//FOR
 
 }//Objects

   public static void main(String args[])
   {
        parallel();//Displays Arrays

        tokens();

        Object theList[] = { 123, "Java", 3.75,"Fall C", 2099 };

        theArrayList(theList);

        Object arrayObjects[] = {1, "one", 1.4, 0.25, "COP2250", "Java Language", 100};
         
        theObjects();        

    }//MAIN 


}//BROWNE CLASS
