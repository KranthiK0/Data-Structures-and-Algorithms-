package dsa;

import java.util.Scanner;


class UF
{


        private int[] id; // instance field private -> no one should access this array except this class

       public UF(int N ) // when object is  created it creates array of size N
       {
           id = new int[N];

           for(int i = 0 ; i< id.length ; i++)
           {
               id[i]= i ; // set id of each object to itself
           }
       }

       public boolean connected(int p , int q)
       {
           return(id[p]==id[q]); // checks  address of the object being refered
           // value refered is same for both objects so we check the if objects points to same address


       }

       public void union(int p , int q) // we have n elements , so we have loop through n times
       {
           int pid = id[p];
           int qid = id[q];

            for(int i = 0 ; i < id.length ; i++) // loop through entire array
            {
               if  (id[i]== pid) // if the object is same as object of p
               {
                   id[i]= qid; // to make connection we change obj of p to object of q
               }
            }
       }
    public static void main(String[] args) {





    }
}