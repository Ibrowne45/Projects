class browneiTheDriverPgm4 
{     
 
    public static void main(String args[])
    {

        browneiSuperPgm4 spr = new browneiSuperPgm4();

        spr.method2("Test","Test");
     
        spr.method3();

        browneisub1 subs1 = new browneisub1();

        subs1.method2("Test","Test");

        subs1.method3();

        browneisub2 subs2 = new browneisub2();
                
        subs2.method2("Test","Test");
            
        subs2.method3();

        browneisub3 subs3 = new browneisub3();
                
        subs3.method2("Test","Test");
            
        subs3.method3();

        browneiTheBuilder sbuild = new browneiTheBuilder();

        sbuild.display();

        browneiOverloader sOver = new browneiOverloader();

        sOver.method2("Test","Test");

        int num1 = 784; //fn is first number
        int num2 = 5; //sn is second number
        int num3 = 123;  //tn is third number
        int num4 = 56;
        
        System.out.printf( "Original items  : %d %d %d %d\n",
                           num1, num2, num3, num4 );
             
        browneiswap Swap = new browneiswap();

        Swap.swapNum(num1, num2, num3, num4);

        String name[] = {"i","m","m","a","n","u","e","l","b","r","o","w","n","e"};
        
        browneiSort bSort = new browneiSort();

        bSort.bubbleSort(name);

        browneirecursion rFac = new browneirecursion();

        rFac.factorial(10);

    }//End of main


}//End of Driver
