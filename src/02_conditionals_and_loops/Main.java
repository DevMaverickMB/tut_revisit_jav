import java.util.*;

public class Main {
    public static void main(String[] args){
        //If else ladder

        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter your current salary : ");
        int salary = sc.nextInt();

        if(salary >= 10000 && salary < 30000){
            System.out.println("You need to work very hard now");
        }
        else if(salary >= 30000 & salary < 75000){
            System.out.println("You haven't achieved anything in life right now");
        }
        else if(salary >= 75000 & salary < 100000){
            System.out.println("Now you are ready to make a switch");
        } else{
            System.out.println("Enter your correct salary");
        }
    }
}
