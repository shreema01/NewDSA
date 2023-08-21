package Array.singleArray.generalCode;

import java.util.Scanner;

public class userInputp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        System.out.println("Enter the element:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
          System.out.println("Print the element:");
        for (int i = 0; i < arr.length; i++) {
           System.out.println(i);
        }
    }
    
}
