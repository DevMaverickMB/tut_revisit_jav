import java.util.*;

public class Multidimension_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [][] multi = new int[4][4];

        for(int i = 0; i < multi.length; i++){
            for(int j = 0; j < multi[i].length; j++){
                System.out.print("Enter number at " + i + "," + j + " : ");
                multi[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < multi.length; i++){
            System.out.print("[");
            for(int j = 0; j < multi[i].length; j++){
                
                System.out.print(multi[i][j] + " , ");
                
            }
            System.out.print("]");
            System.out.println();
        }


    }
}
