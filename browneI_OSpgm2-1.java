/************************************
Author	  : Immanuel Browne
Course    : CGS 3767 
Professor : Michael Robinson
Program # : 2 Hex to Binary to Decimal

Due Date  : 06/15/2022


Certification :
I hereby certify that this work is my own and none of it is the work of any other person

..........{Immanuel Browne}.........
*************************************/

import java.io.*;

import java.util.Scanner;

import java.io.IOException;


public class browneI_OSpgm2
{
    private Scanner file;

   
   public static String convert(String chip)
   {

        String binary = "";
       for(int x=0; x < chip.length(); x++)
       {
       
           switch(chip.charAt(x))  //Hex to Binary 
           {
             
               case 'A':
                        binary += "1010";
                         break;
               case 'B':
                         binary += "1011";
                         break;

               case 'C':
                         binary += "1100";
                         break;
               case 'D':
                         binary += "1101";
                         break;
               case 'E':
                          binary += "1110";
                         break;
               case 'F':
                          binary += "1111";
                         break;
               case '0':
                          binary += "0000";
                         break;
               case '1':
                          binary += "0001";
                         break;
               case '2':
                          binary += "0010";
                         break;
               case '3':
                          binary += "0011";
                         break;
               case '4':
                          binary += "0100";
                         break;
               case '5':
                          binary += "0101";
                         break;
               case '6':
                          binary += "0110";
                         break;
               case '7':
                          binary += "0111";
                         break;
               case '8':
                          binary += "1000";
                         break;
               case '9':
                          binary += "1001";
                         break;   

           }//Switch  
   
       }//For
	return binary;

    }//Convert

    public static long convert2(String binary)
    {
	long test =0;   
	long multiply = 1;

        for(int z = binary.length() -1; z >= 0; z--)
        {

            if(binary.charAt(z) == '1')
            {

               test += multiply;
               

            }
            multiply *= 2;

        }
	    return test;
    }


    public static String chipName(Long num)
    {
	String chips="";
        
        if(num >= 0 && num <= 34359738368L)
        {
           chips = "0";
 
        }
	else if(num >= 34359738368L && num <= 6871947638L)
        {

           chips = "1";
 
        }
	else if(num >=  6871947638L && num <= 103079215108L)
        {

           chips = "2";
       
        }
	else if(num >= 103079215108L && num <= 137428953478L)
        {
        
           chips = "3";
 
        }
	else if(num >=  137428953478L && num <= 171798691848L)
        {

           chips = "4";

        }
	else if(num >= 171798691848L && num <= 2061584302218L)
        {

           chips = "5";

        }
	else if(num >= 2061584302218L && num <= 2405181685881L)
        {

           chips = "6";

        }
	else if(num >= 2405181685881L && num <= 274877906958L)
        {
        
           chips = "7";

        }
	else
	{
	
           chips =  "N/A";
	
        }
       return chips;

    }

   public static void printData(String chip, String er, long test, String chips2)
   {

       
       System.out.printf("%n %s = %s = %-13s = %s", chip, er,test,chips2);
  
   }


   public void lowerCase()
   {

       for(int i = 97; i <= 122; i++)
       {

          System.out.printf("The ASCII value of " + (char)i + " = " + i + "%n");            

       }//For

   }//Lower

   public void upperCase()
   {

       for(int i = 65; i <= 90; i++)
       {

          System.out.printf("The ASCII value of " + (char)i + " = " + i + "%n");            

       }//For

   }//Lower



   public static void main(String[] args) throws IOException
   {
       File errors = new File ("RAMerrors8x4f.6");
	
       Scanner file = new Scanner(errors);
       
       browneI_OSpgm2 con = new browneI_OSpgm2();

       con.lowerCase();
  
       con.upperCase();	

        while(file.hasNextLine())
        {

         String chip = file.nextLine();  
          
         String er = convert(chip);  

         long test = convert2(er);

         String chips2 = chipName(test); 
        
         printData(chip, er, test, chips2);       

       }//Loop

   }//Main

}//Browne Class
