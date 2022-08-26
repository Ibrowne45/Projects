/*********************************************************************
        Author    : Immanuel Browne
        Course    : COP 3804 Intermediate Java
        Professor : Michael Robinson
        Program # : To review Java 1 concepts, introduce and prepare for
Java 2 topics


        Due Date  : 05/22/2022


        Certification:
        I hereby certify that this work is my own and none of it is the
work of any other person.

        ..........Immanuel Browne..........
*******************************************************************/

class browneIPgm1
{
   public static void algo(int arr2[][])
   {
     int sum = 0;

     for(int x = 0; x < 15; x++)
     {
        
        for(int y = 0; y < 15; y++)
        {
          
          sum = sum + arr2[x][y];
         
        }//COL

     }//ROw
   System.out.printf("\nSum = " + sum);
   }//Algo   

    public static void display(int arr2[][])
    {
       
       for(int x = 0; x < 15; x++)
       {
       
         for(int y = 0; y < 15; y++)
         {
            
               if( (x+y) < 15 ) //test for variable width
               {
                   System.out.print( " " ); //display space
               }
             
               //display data inside each array index
               System.out.print( " " + arr2[x][y] );
         }//Col
         
 
       }//Row

         System.out.println(); //display a line feed
       
         algo(arr2);
         
         System.out.printf("\nImmanuel Browne");         

    }// Display    
      
    public static void array(int arr2[][])
    {
     
      for(int x = 0; x < 15; x++)
      {
     
        for(int y = 0; y < 15; y++)
        {
     
         arr2[x][y] = (x + y) * 3;
    
        }//COL       
   
      }//ROW
      
      display(arr2);   
      
       
    }//LOAD ARRAY

    public static void main(String arg[])
    {
      int arr2[][] = new int [15][15];
      
      array(arr2);

            

    }//MAIN

}//Class
