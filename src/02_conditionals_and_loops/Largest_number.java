import java.util.*;

// **************** Print Largest number among the given numbers *********************** 

public class Largest_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.println("Enter a: ");
        // int a = sc.nextInt();
        // System.out.println("Enter b: ");
        // int b = sc.nextInt();
        // System.out.println("Enter c: ");
        // int c = sc.nextInt();

        // int largest_number = 0;

        // if(a > largest_number){
        //     largest_number = a;
        // } 

        // if( b > largest_number){
        //     largest_number = b;
        // }

        // if(c > largest_number){
        //     largest_number = c;
        // }
        
        // System.out.println("Largest number is: " + largest_number);

        //************************ Using Math Function *******************/

        int max = Math.max(67, Math.max(54, 23));
        System.out.println(max);

    }
}
