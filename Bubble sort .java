/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main {
    static void bubble_sort(int[] arr, int n) {
        for (int i = n - 2; i >= 0; i--) {
          bool swap = 0 ; 
            for (int j = 0; j <= i ; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap = 1 ; 
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    
                }
              if(swap == 0)
              {
                break;
              }
            }
        }

        System.out.println("After bubble sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
        public static void main(String[] args)
        {
            int[] arr = {13,46,24,52,20,9};
            int n = arr.length;

           // selection_sort(arr , n );
            bubble_sort(arr , n );


        }


}
