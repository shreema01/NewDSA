package Array.twoDarray.searching;

import java.util.Arrays;

public class binarysearchtwod {
    static int[] function(int arr[][],int target){
    for (int i = 0; i < arr.length; i++) {
        for (int j= 0; j < arr[i].length; j++) {
            if(arr[i][j] == target){
            return new int[]{i,j}; 
            }
           
        }
        
        
    }
    return new int[] {-1,-1};

}
    
    public static void main(String args[]){
    int arr[][]={{1,2,3},
    {4,5,6},
    {7,8,9}};
    int target=6;
    int[] result=function(arr,target);
    System.out.println("element found in" + Arrays.toString(result));
    }

}
