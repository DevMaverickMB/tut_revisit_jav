import java.util.*;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //*******************For loops:*************************

        // for(int i = 0; i < 5; i++){
        //     System.out.println(i);
        // }

        //**************print numbers till n***************

        // System.out.println("Enter your number : ");
        // int user_number  = sc.nextInt();
        // for(int i = 1; i<=user_number; i++){
        //     System.out.println(i);
        // }

        //**************While loop***********
        
        // System.out.println("Enter your number: ");
        // int number = sc.nextInt();

        // int i = 1; 

        // while(i <= number){
        //     System.out.println(i);

        //     i++;
        // }

        //***********Do-While Loop*****************
        //this loop runs atleast once no matter what the condition is

        //Do{
        //
        // } while(condition);

        int i = 1;
        do { 
            System.out.println(i);
            i++;
            
        } while (i<=5);
    } 
}
