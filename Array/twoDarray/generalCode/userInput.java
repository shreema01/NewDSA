import java.util.*;

public class userInput {
    static void function(int[][] arr){
        System.out.println("output:");
    for (int i = 0; i < arr.length; i++) {
        for (int j= 0; j < arr[i].length; j++) {
            System.out.print(arr[i][j] + " ");
        }
        System.out.println(); 
    }

    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] arr=new int[row][col];
        System.out.println("Enter the element:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col ; j++) {
                arr[i][j]=sc.nextInt();
                
            }
            
        }
     

    function(arr);
    }
    
}
