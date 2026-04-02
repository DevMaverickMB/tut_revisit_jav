import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number you want to check: ");
        int number = sc.nextInt();

        System.out.println(armstrong(number));


    }

    static boolean armstrong(int n){
        int sum = 0;
        int number = n;

        while(number > 0){
            int rem = number % 10;
            sum += rem*rem*rem;

            number = number / 10;
        }

        if(sum == n){
            return true;
        }

        return false;
    }
}
