import java.util.Arrays;

public class Search_in_2D {
    public static void main(String[] args) {
        int[][] arr = {
            {23, 3, 45},
            {243, 56, 78},
            {765, 13, 8, 1}
        };

        int target = 765;

        System.out.println(Arrays.toString(search(arr, target)));
    }

    static int[] search(int[][] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] == target){
                    return new int[] {i, j}; 
                }
            }
            
        }
        
        
        return new int[] {};
    }
    
}
