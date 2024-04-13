/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Main 
{
    // static int count = 0 ; 
    // static void printname(String name)
    // {
        
    //     if (count==5)
    //     {
    //         return ;
    //     }
        
    //     System.out.println(name);
    //     count++;
        
    //     printname(name);
        
    // }
    // static int count = 1 ; 
    // static void printnum(int num)
    // {
    //     if( count == num+1)
    //         return;
            
    //     System.out.println(count);
    //     count++;
    //     printnum(num);
    // }
    
    // backtracking 
    
    static void printnum(int i , int n )
    {
        if(i > n)
            return;
            
        printnum(i+1,n);
        System.out.println(i);
        
    }
    
    public static void main(String[] args)
    {
      //  printname("kranthi");
          printnum( 1 , 5);
    }
}