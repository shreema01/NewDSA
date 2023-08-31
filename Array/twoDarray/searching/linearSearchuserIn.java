package Array.twoDarray.searching;

import java.util.Arrays;
import java.util.Scanner;

public class linearSearchuserIn {
    static int[] function(int[][] arr,int target){
        System.out.println("output:");
    for (int i = 0; i < arr.length; i++) {
        for (int j= 0; j < arr[i].length; j++) {
            if(arr[i][j]==target){
                return new int[]{i,j};
            }
        }
          
    }
    return new int[]{-1,-1};

    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] arr=new int[row][col];
        int target=6;
        System.out.println("Enter the element:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col ; j++) {
                arr[i][j]=sc.nextInt();
                
            }
            
        }
     
int result[]=function(arr,target);
System.out.println("Element found in:"+ Arrays.toString(result));
    
    }
    
}
