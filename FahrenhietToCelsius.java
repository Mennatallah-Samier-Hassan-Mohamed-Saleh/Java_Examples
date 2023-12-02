import java.util.Scanner;

public class FahrenhietToCelsius {
    public static void main(String [] args)
    {
        final int MAX_TEMP = 140;
        final int MIN_PARK_TEMP  = 70;
        final int MAx_PARK_TEMP  = 90;

        Scanner Input = new Scanner(System.in);
        System.out.print("Enter a Fahrenheit Value: ");
        int Fahrenheit = Input.nextInt();

        while ( Fahrenheit >= MAX_TEMP)
        {
            System.out.println("Error: The Fahrenheit value must be lower than " + MAX_TEMP);
            System.out.println("Please enter another Fahrenhiet value: ");
            Fahrenheit=Input.nextInt();
        }
        
        System.out.print("Enter a Day of the week: ");
        String Day = Input.next();
        double celsius = (5.0 / 9 ) * ( Fahrenheit -32 );

        System.out.println(Day + "Fahrenheit: " + Fahrenheit) ;
        System.out.printf("%s %.1f \n" , Day + " Celsius:", celsius) ;

        if ((Fahrenheit >= 86) && (Fahrenheit <= 95))
            System.out.println("Go to the swimming pool");
        else if ((Fahrenheit >= 70) && (Fahrenheit < 86))
            System.out.println("Go to the park");
        else if ((Fahrenheit >= 50) && (Fahrenheit < 70))
            System.out.println("Lounge on the patio");
        else if ((Fahrenheit >= 32) && (Fahrenheit < 50))
            System.out.println("Make a snowman");
        System.out.println("Bye");
    }
    
}
