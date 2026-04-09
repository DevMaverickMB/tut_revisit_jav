public class LinearSearch {
    public static void main(String[] args) {

        int[] arr = {
            123, 54, 564, 23, 435, 12, 76, 87, 34
        };

        System.out.println(linear_search(arr, 87));
        
    }

    static int linear_search(int[] arr, int num){

        if(arr.length == 0){
            return -1;
        }
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == num){
                return i;
            }
        }
        return -1;
    }
} 