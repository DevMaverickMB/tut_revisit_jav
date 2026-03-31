
public class Switch_intro {
    public static void main(String[] args) {
        String fruit = "Banana";

        // ************ Enhanced Switch ************

        switch (fruit){
            case "Mango" -> System.out.println("King of fruits");

            case "Apple" -> System.out.println("Keeps doctor away");

            case "Banana" -> System.out.println("Good for muscles");

            default -> System.out.println("Not a good fruit");
        }

        // ****************** Traditional Switch ****************
        switch (fruit){
            case "Mango" :
                System.out.println("King of fruits");
                break;

            case "Apple" :
                System.out.println("Keeps doctor away");
                break;

            case "Banana" :
                System.out.println("Good for muscles");
                break;

            default: 
            System.out.println("Not a good fruit");
        }
    }
    
}
