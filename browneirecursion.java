class browneirecursion
{
  
    public static void showStep( String array[] )
    {    
        
        for( String element : array )  //ENHANCED LOOP
        {   
            System.out.printf("%s %n" , element  );
        }
    }//Show
   

    public static long factorial( int n )
    {
        
       
        if( n <= 1 ) //base case
        {
                	 
            return 1; 
        }
        else
        {
            System.out.printf( "Doing recursion by calling" + 
                               "factorial( %d-1 )\n",  n );
            
            //doing recursion by calling factorial(n - 1)
            long counter = n * factorial(n - 1); 
            
            System.out.printf( "Receiving results of " +
                               "factorial( %d ) =  %d * %d! =" +
                               " %d\n",  n, n, (n-1), counter );
                    
            return counter;
        }

}


}
