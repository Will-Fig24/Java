/* Create a Java program to sort any ten array elements using simple sorting algorithms 
- Insertion x 
- Bubble x
- Selection x
- Shell x
- Merge
- Quick x
The program's screenshots and the output must be uploaded as a single file in a single attempt before the due date.*/

import java.util.Scanner;
import java.io.*;

public class SortingMethods
   {
      public static void main(String [] args)
         {
            Scanner kb = new Scanner(System.in);
      
            int [] list = {10, 25, 14, 42, 52, 24, 11, 2, 7, 9};
            int i, sort;
            
            System.out.println("Make a choice: \n" + 
                         "Press 1 for Insertion \n" +
                         "Press 2 for Bubble  \n" +
                         "Press 3 for Selection \n" +
                         "Press 4 for Shell \n" +
                         "Press 5 for Merge \n" +
                         "Press 6 for Quick");
                         
            sort = kb.nextInt();
            
            switch (sort)
               {
                  case 1: // insertion sort
                  
                  System.out.print("Before Insertion Sort: "); 
                  for(i = 0; i < list.length; i++)
                     System.out.print(list [i] + " ");
            
                  insertionSort(list); 
            
                  System.out.print("\nAfter Insertion Sort: ");
                  for (i = 0; i < list.length; i++)
                     System.out.print(list [i] + " ");
                     
                  break;
                  
                  case 2: // bubble sort
                  
                  System.out.print("\nBefore Bubble Sort: "); 
                  for(i = 0; i < list.length; i++)
                     System.out.print(list [i] + " ");
            
                  bubbleSort(list); 
            
                  System.out.print("\nAfter Bubble Sort: ");
                  for (i = 0; i < list.length; i++)
                     System.out.print(list [i] + " ");
                     
                  break;
                  
                  case 3: // selection sort
                  
                  System.out.print("\nBefore Selection Sort: ");
                  for(i = 0; i < list.length; i++)
                     System.out.print(list [i] + " ");
                     
                  selectionSort(list);
                  
                  System.out.print("\nAfter Selection Sort: ");
                  for(i = 0; i < list.length; i++)
                     System.out.print(list [i] + " ");
                     
                  break;
                  
                  case 4: // shell sort
                  
                  System.out.print("\nBefore Shell Sort: "); 
                  for(i = 0; i < list.length; i++)
                     System.out.print(list [i] + " ");
                  
                  shellSort(list);
                     
                  System.out.print("\nAfter Shell Sort: "); 
                  for(i = 0; i < list.length; i++)
                     System.out.print(list [i] + " ");
                     
                  break;
                  
                  case 5: // merge sort
                  
                  System.out.print("\nBefore Merge Sort: "); 
                  for(i = 0; i < list.length; i++)
                     System.out.print(list [i] + " ");
                  
                  //merge(list, 0, list.length - 1);
                
                  System.out.print("\nAfter Merge Sort: ");
                  for(i = 0; i < list.length; i++)
                     System.out.print(list [i] + " ");
                     
                  break;
                  
                  case 6: // quick sort
                  
                  System.out.print("\nBefore Quick Sort: "); 
                  for(i = 0; i < list.length; i++)
                     System.out.print(list [i] + " ");
                  
                  quickSort(list, 0, list.length - 1);
                  
                  System.out.print("\nAfter Quick Sort: "); 
                  for(i = 0; i < list.length; i++)
                     System.out.print(list [i] + " ");
                     
                  break;
                  
                  default:
                     System.out.println("Invalid");
               }
         }
      
      // INSERTION
      public static void insertionSort(int li []) 
         {    
            for (int i = 1; i < li.length; i++) 
               {  
                  int index = li [i];  
                  int j = i;  
                        
                  while (j > 0 && li [j-1] > index) 
                     {  
                        li [i] = li [i-1];  
                        j--;  
                     }  
                        
                  li[j] = index;  
               }  
         }
      
      // BUBBLE   
      public static void bubbleSort(int li [])
         {
            for(int i = (li.length - 1); i >= 0; i--)
               {
                  for (int j = 1; j <= i; j++)
                     {
                        if (li[j-1] > li[j])
                           {
                              int temp = li [j-1];
                              li [j-1] = li[j];
                              li [j] = temp;
                           }
                     }
               }
         }
      
      // SELECTION
      public static void selectionSort(int [] li)
         {  
            for (int i = 0; i < li.length-1; i++)
               {
                  int min = i;
                  
                  for (int j = i + 1; j < li.length; j++)
                     {
                        if (li[j] < li[min])
                           min = j;
                     }
                  
                  int temp = li[min];
                  li[min] = li[i];
                  li[i] = temp;
               }
         }
      
      // SHELL
      public static int shellSort(int [] li)
         {
            int gap, j;
            int i = 0;
            
            for (gap = li.length/2; gap > 0; gap /= 2)
               {
                  for(i = gap; i < li.length; i += 1)
                     {
                        int temp = li[i];
                        
                        for (j = i; j >= gap && li[j - gap] > temp; j -= gap)
                           li[j] = li[j - gap];
                        
                        li[j] = temp;
                     }                  
               }
            
            return 0;
         }
      
      // MERGE     
      public static void merge(int [] li, int le, int mid, int ri)
         {
            int i = 0;
            int j = 0;
            int k = 1;
            int a = mid - 1 + 1;
            int b = ri - mid;
            int L[] = new int [a];
            int R[] = new int [b];
            
            for(i = 0; i < a; ++i)
               L[i] = li[le + i];
            
            for(j = 0; i < b; ++j)
               R[j] = li[mid + 1 + j];
            
            while (i < a && j < b)
               {
                  if(L[i] <= R[j])
                     {
                        li[k] = L[i];
                        i++;
                     }
                     
                  else
                     {
                        li[k] = R[j];
                        j++;
                     }
                  
                  k++;
               }
            
            while(i < a)
               {
                  li[k] = L[i];
                  i++;
                  k++;
               }
            
            while(j < b)
               {
                  li[k] = R[j];
                  j++;
                  k++;
               }
         }
      
      static void sort(int li[], int le, int ri)
         {
            if(le < ri)
               {
                  int mid = 1 + (ri - 1)/2;
                  
                  sort(li, le, mid);
                  sort(li, mid + 1, ri);
                  
                  merge(li, le, mid, ri);
               }
         }
      
      // QUICK
      static void swap(int [] li, int i, int j)
         {
            int temp = li[i];
            li[i] = li[j];
            li[j] = temp;
         }
         
      static int partition(int [] li, int low, int high)
         {
            int pivot = li[high];
            int i = (low - 1);
            
            for(int j = low; j <= high - 1; j++)
               {
                  if(li[j] < pivot)
                     {
                        i++;
                        swap(li, i, j);
                     }
               }
            
            swap(li, i + 1, high);
            return (i + 1);
         }
         
      static void quickSort (int [] li, int low, int high)
         {
            if (low < high)
               {
                  int pi = partition(li, low, high);
                  quickSort(li, low, pi - 1);
                  quickSort(li, pi + 1, high);
               }
         }
   } 