package Array.singleArray.generalCode;

import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[10];
        System.out.println("Enter element:");
         for (int i = 0; i < arr.length; i++) {

            arr[i]=sc.nextInt();
         }
         System.out.println("Output");
         for (int i = 0; i < arr.length; i++) {
            System.out.println(i);
         }
    }
    
}
