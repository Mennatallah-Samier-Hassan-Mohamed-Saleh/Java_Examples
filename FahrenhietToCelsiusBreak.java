import java.util.Scanner;

public class FahrenhietToCelsiusBreak {
    public static void main(String [] args)
    {
        final int MAX_TEMP = 200;
        final int MIN_TEMP  = -200;

        Scanner Input = new Scanner(System.in);

        double totalFahrenhiet =0;
        int ValidFahrenhiet=0;
        int Fahrenheit;
        for ( int i =0; i<=5;i++)
        {
            System.out.print("Enter a Fahrenheit Value: ");
            Fahrenheit = Input.nextInt();
            if ((Fahrenheit >= MIN_TEMP) && (Fahrenheit <= MAX_TEMP))
            {
                totalFahrenhiet=totalFahrenhiet+Fahrenheit;
                ValidFahrenhiet++;
            }
            else
            {
                System.out.println("Invalid value: ");
                //break;
                continue;

            }
        }

        if (ValidFahrenhiet > 0) {
            System.out.println("Average Fahrenhiet Temprature: "+ totalFahrenhiet/ValidFahrenhiet);

        }
    }
    
}
