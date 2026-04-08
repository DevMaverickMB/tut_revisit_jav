import java.util.*;

public class Reverse_array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        reverse_array(arr);
    }

    static void reverse_array(int[] arr){
        int start = 0;
        int end = arr.length-1;

        System.out.println(Arrays.toString(arr));

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        System.out.println(Arrays.toString(arr));
    }
    
}
