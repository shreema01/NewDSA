package Array.twoDarray.searching;

public class binarysearch {
    public static void main(String args[]){
        int arr[]={1,2,3,5,6,8,9};
        int target=5;
        int result=binarySearch(arr,target);
        System.out.println("The element found in:" +result);

    }
    static int binarySearch(int arr[],int target){

        int start=0;
        int end=arr.length-1;

        while(end>=start){
            int mid=start+(end-start)/2;
            
            if(target>arr[mid]){
                start=mid+1;
            }
           else if(target<arr[mid]){
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return(-1);
    }
}
