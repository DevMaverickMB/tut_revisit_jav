public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 9, 11, 12, 14, 20, 36, 48};
        int[] descArray = {48, 36, 20, 14, 12, 11, 9, 5, 4, 2};

        int num = 2;

        System.out.println(binarySearch(descArray, 9));
    }

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        // while(start <= end){
        //     int middle = start + (end-start)/2; // Because doing start + end directly may exceed the maximum length allowed in int

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

        //for descending array:

        while(start <= end){
            int middle = start + (end-start)/2; // Because doing start + end directly may exceed the maximum length allowed in int

            if(arr[middle] == target){
                return middle;
            }
            if(target > arr[middle]){
                end = middle - 1;
            }
            if(target < arr[middle]){
                start = middle + 1;
            }
        }


        
        return -1;
    }


    
    
    
}