import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        
        // ****************** Fibonacci Number ******************
        //addition of n + (n-1)

        int n = 5;
        int current = 1;
        int previous = 0;
        int next = 0;

        if(n <= 0){
            System.out.println(0);
        } else if (n == 1){
            System.out.println(1);
        } else {

            for(int i = 0; i < n - 1 ; i++){
            next = current + previous;

            previous = current;
            current = next;
            }

            System.out.println(current);

        }

        
    }
}
