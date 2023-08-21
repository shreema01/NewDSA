package Array.singleArray.searching;

public class binarySearch {



    public static void main(String[] args) {
        //binary searchArray should be sorted
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int target=4;
        int result=binarySearch(arr,target);
        System.out.println("Element found in:"+ result);
    }
    static int binarySearch(int[] arr,int target){
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
