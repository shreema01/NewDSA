package Array.singleArray.searching;

import java.util.Scanner;

public class linearSearch
 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[10];

        int target=3;

        System.out.println("Enter element:");
         for (int i = 0; i < arr.length; i++) {

            arr[i]=sc.nextInt();
         }
         System.out.println("Output");
         for (int i = 0; i < arr.length; i++) {
             if(arr[i]==target){
               System.out.println("Target element found in index no:"+i);
             }
         }
         System.out.println();
    }
    
}
