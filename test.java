import java.util.Scanner;

public class test {
    public static void main(String [] args)
    {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter a Fahrenheit Value: ");
        String yourString = Input.next();

        try {
            double number = Double.parseDouble(yourString);
        
        } catch (NumberFormatException ex) {
            System.out.println("Not a valid number!");
        }
        System.out.println("Hello Manosha");

    }
    
}
