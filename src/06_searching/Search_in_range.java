public class Search_in_range {
    public static void main(String[] args) {
        int[] arr = {
            12, 345, 65, 76, 76, 82, 71, 21, 27
        };

        System.out.println(search_in_range(arr, 76, 2, 4));


    }

    static int search_in_range(int[] arr, int target, int start, int end){
        for(int i = start; i <= end; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    
}
