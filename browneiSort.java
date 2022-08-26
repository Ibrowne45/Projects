class browneiSort
{
   
   public static void bubbleSort(String array[])
    {
    
        int maxElement;
        int index;
        String temp;
         
        for( maxElement = array.length - 1; maxElement >= 0; maxElement-- )
        {
    
            for( index = 0; index <= maxElement - 1; index++ )
            {
    
               if( array[index].compareTo(array[index + 1]) > 0 )
               {
                    // Swap the two elements.
                    temp = array[index];
                    array[index] = array[index + 1];
                    array[index + 1] = temp;
                }//end if (array[index] > array[index + 1])
         
        
            }//end inner loop: for( index =0; index <= maxElement- 1;
             //index++ )
                               
        }//end outer loop: for (maxElement = array.length - 1;
         //maxElement >= 0; maxElement--)
            

        showStep(array);
                               
   }//Bubble Sort

    public static void showStep( String array[] )
    {

        for( String element : array )  //ENHANCED LOOP
        {
            System.out.printf("%s %n" , element  );
        }
    }//Show



}
