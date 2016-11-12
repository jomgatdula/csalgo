import java.util.Scanner;
public class SelectionSort {
    
public static void main (String args[]){
    Scanner num=new Scanner (System.in);
    int x =0 ;
    System.out.println("enter number of input:");
    x = num.nextInt();
    int list[]=new int[x];
    for(int h = 0; h <x; h++){
      System.out.println("enter a number:");
         list[h]=num.nextInt();  
           System.out.println(list[h]);
    }
     
    int min;
     System.out.println("sorted: ");
    for (int i = 0; i < list.length; i++) {
         
        
         min = i;
         for (int j = i + 1; j < list.length; j++) {
            if (list[j] < list[min]) {
                min = j;
               
            }
        }
        if (min != i) {
            int temp = list[i];
            list[i] = list[min];
            list[min] = temp;
        }
     System.out.println(list[i]); 

    }
}
}