import java.util.*;

public class Counter {
public static void main(String[] args) {
    int counter = 0;

    long n = 138390333674893l;

    while(n > 0){
        if(n % 10 == 3){
            counter++;
        }
        n = n/10;
    }
    System.out.println(counter);
}    
}
