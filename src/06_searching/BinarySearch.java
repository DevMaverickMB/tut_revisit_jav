public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 9, 11, 12, 14, 20, 36, 48};
        int num = 36;

        System.out.println(binarySearch(arr, num));
    }

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int middle = (start + end)/2;


            if(arr[middle] == target){
                return middle;
            }
            if(target > arr[middle]){
                start = middle + 1;
            }
            if(target < arr[middle]){
                end = middle - 1;
            }
        }

        // for(int i = start; i <= end; i++){
        //     int middle = (start + end)/2;

        //     if(arr[middle] == target){
        //         return middle;
        //     }
        //     if(target > arr[middle]){
        //         start = middle + 1;
        //     }
        //     if(target < arr[middle]){
        //         end = middle - 1;
        //     }
            
        // }
        
        return -1;
    }


    
    
    
}