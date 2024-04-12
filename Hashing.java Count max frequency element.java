/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
import java.util.HashMap;
class Main
{
    public static void main(String [] args )

    {
        
        Map<Integer,Integer> frequencyMap = new HashMap<>();
        
        
        int[] arr = {2,2,3,4,4,2};
        
        for (int element : arr) 
        {
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
        }
        int maxElement = Integer.MIN_VALUE; // Initialize with smallest possible integer
        int maxFrequency = Integer.MIN_VALUE; // Initialize with smallest possible integer

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
             int key = entry.getKey();
             int frequency = entry.getValue();
             
            if (frequency > maxFrequency|| (frequency == maxFrequency && key < maxElement)) {
                maxElement = entry.getKey();
                maxFrequency = entry.getValue();
            }
            
        }
        
        System.out.println(maxElement);
        
        // using frequency array 
        
        // int element = MaxInArray(arr);
        
        // int[] freq_arr = new int[16];
        
        // for(int i = 0 ; i < arr.length ; i++)
        // {
        //     freq_arr[arr[i]]++;
        // }
        
        // int max_element = MaxInFreqArray(freq_arr);
        // System.out.println(max_element);
    }
    
    public  static int MaxInArray(int[] arr)
    
    {
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i] > max)
                max = arr[i];
                
        }
        
        return max ; 
    }
    
    public static int MaxInFreqArray(int[] arr) 
    {
        
    int max = Integer.MIN_VALUE;
    int index = -1;

    for (int i = 0; i < arr.length; i++) {
        if (arr[i] > max) {
            max = arr[i];
            index = i;
        }
    }

    return index;
}
    
    
}