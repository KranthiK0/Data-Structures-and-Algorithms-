/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;

class Main 
{
    static void merge(int[] arr , int low , int mid , int high)
    {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low ;
        int  right = mid+1;
        
        while(left <= mid && right <= high)
        {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }
        while(left <= mid)
        {
             temp.add(arr[left]);
                left++;
        }
        while(right <= high)
        {
            temp.add(arr[right]);
                right++;
        }
        
        for(int i = low ; i<= high;i++)
        {
            arr[i] = temp.get(i-low);
        }
    }
    
    static void mergesort(int[] arr , int low , int high)
    {
        // base condition 
        if(low >= high)
        {
            return; 
        }
            
        int mid = (low+high)/2;
        
        mergesort(arr, low , mid);
        mergesort(arr,mid+1, high);
        merge(arr, low, mid , high);
        
        
        
    }
    
    public static void main(String[] args)
    {
      int[] arr = { 9, 4, 7, 6, 3, 1, 5};
     int  high = arr.length - 1 ; 
      int low = 0;
      Main.mergesort(arr,low, high);
      
      for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}