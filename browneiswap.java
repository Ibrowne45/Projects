class browneiswap
{

   public static void swapNum(int num1, int num2, int num3, int num4)
    {
            
        int temp = 0;
            
        if( num1 > num2)
        {
            temp  = num1;
            num1  = num2;
            num2  = num3;
            num3  = num4;
            num4  = temp;
            
            System.out.printf( "After swap1  : %d %d %d %d\n",
                               num1, num2, num3, num4);
        }
            
        if( num2 > num3)       // temp = 80 fn = 48  sn = 80    tn = 7
        {
            temp  = num2;     // temp = 80 fn = 48  sn = 80    tn = 7
            num2  = num3;     // temp = 80 fn = 48  sn = 7    tn = 7
            num3  = num4;   // temp = 80 fn = 48  sn = 7    tn = 80
            num4  = temp;
    
            System.out.printf( "After swap2  : %d %d %d %d\n",
                               num1, num2, num3, num4);
        
        
        }

        if( num3 > num4)       // temp = 80 fn = 48  sn = 7    tn = 80
        {
            temp  = num3;     // temp = 48 fn = 48  sn = 7    tn = 80
            num3  = num4;     // temp = 48 fn = 7   sn = 7    tn = 80
            num4  = temp;

            System.out.printf( "After swap3  : %d %d %d %d\n",   
                               num1, num2, num3, num4);
                    
        }
                    
    }//SWAP


}
